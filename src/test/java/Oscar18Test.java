import javassist.expr.Cast;
import models.Award.Oscar;
import models.Award.Oscar18;
import models.Cast.Actor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Oscar18Test {
    Actor actor_1;
    Actor actor_2;
    Oscar oscar18BestActor;

    @Before
    public void before(){
        actor_1 = new Actor("Bob", "Hoskins", "American", true);
        actor_2 = new Actor("Leo", "DiCaprio", "American", false);
        oscar18BestActor = new Oscar18("Best Actor");
    }

    @Test
    public void hasCategory(){
        assertEquals("Best Actor", oscar18BestActor.getCategory());
    }

    @Test
    public void canSetCategory(){
        oscar18BestActor.setCategory("Best Actress");
            assertEquals("Best Actress", oscar18BestActor.getCategory());
    }

    @Test
    public void hasCountry(){
        assertEquals("US", oscar18BestActor.getCountry());
    }

    @Test
    public void canChangeCountry(){
        oscar18BestActor.setCountry("United States of America");
        assertEquals("United States of America", oscar18BestActor.getCountry());
    }


}
