import models.Cast.Actor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ActorTest {
    Actor actor_1;

    @Before
    public void before(){
        actor_1 = new Actor("Bob", "Hoskins", "American");
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
        assertEquals("Hoskins", actor_1.getLastName());
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
}
