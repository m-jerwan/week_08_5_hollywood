import models.Award.Bafta18;
import models.Award.Oscar18;
import models.Cast.Actor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Bafta18Test {
    Actor actor_1;
    Actor actor_2;
    Bafta18 bafta18BestActor;

    @Before
    public void before(){
        actor_1 = new Actor("Bob", "Hoskins", "American");
        actor_2 = new Actor("Leo", "DiCaprio", "American");
        bafta18BestActor = new Bafta18("Best Actor", actor_1);
    }

    @Test
    public void hasCategory(){
        assertEquals("Best Actor", bafta18BestActor.getCategory());
    }

    @Test
    public void canSetCategory(){
        bafta18BestActor.setCategory("Best Actress");
        assertEquals("Best Actress", bafta18BestActor.getCategory());
    }

    @Test
    public void hasWinner(){
        assertEquals(actor_1.getClass(), bafta18BestActor.getWinner().getClass());
    }

    @Test
    public void canSetWinner(){
        bafta18BestActor.setWinner(actor_2);
        Actor changedWinner = (Actor) bafta18BestActor.getWinner();
        assertEquals("Leo", changedWinner.getFirstName());
    }

    @Test
    public void hasCountry(){
        assertEquals("UK", bafta18BestActor.getCountry());
    }

    @Test
    public void canChangeCountry(){
        bafta18BestActor.setCountry("United States of America");
        assertEquals("United States of America", bafta18BestActor.getCountry());
    }


}