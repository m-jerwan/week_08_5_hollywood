import models.Award.Award;
import models.Award.CategoriesType;
import models.Award.Oscar18;
import models.Cast.Actor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ActorTest {
    Actor actor_1;
    Award oscar;

    @Before
    public void before(){
        actor_1 = new Actor("Bob", "Hoskings", "American", true);
    }


    @Test
    public void hasFirstName(){
        assertEquals("Bob", actor_1.getFirstName());
    }

    @Test
    public void canSetFirstName(){
        actor_1.setFirstName("Maria");
        assertEquals("Maria", actor_1.getFirstName());

    }

    @Test
    public void hasSecondName(){
        assertEquals("Hoskings", actor_1.getLastName());
    }

    @Test
    public void canSetSecondName(){
        actor_1.setLastName("Wondraczkowa");
        assertEquals("Wondraczkowa", actor_1.getLastName());
    }

    @Test
    public void hasNationality(){
        assertEquals("American", actor_1.getNationality());
    }

    @Test
    public void canSetNationality(){
        actor_1.setNationality("Russian");
        assertEquals("Russian", actor_1.getNationality());
    }

    @Test
    public void isFrontCredits(){
        assertTrue(actor_1.isFrontCredits());
    }

    @Test
    public void hasCreditsName(){
        assertEquals("Bob Hoskings", actor_1.nameForCredits());
    }

    @Test
    public void canWinAward(){
        oscar = new Oscar18(CategoriesType.SUPORTIVEACTOR);
        Award.winningAward(oscar, actor_1);
        String descriptiopn = oscar.getCategory().getDescription();
        assertEquals("Best support actor",actor_1.getAwards().get(0).getCategory().getDescription());
    }
}
