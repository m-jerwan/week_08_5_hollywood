//import models.Cast.Actor;
//import models.Cast.CastMember;
//import models.Crew.CrewMember;
//import models.Crew.Director;
//import models.Film;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static junit.framework.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class FilmTest {
//    Film film_01;
//    Actor actor_1;
//    Director director_1;
//
//    @Before
//    public void before(){
//        film_01 = new Film("Event Horizon", "The Horizon", 100);
//        actor_1 = new Actor("Bob", "Hoskings", "American", true);
//        director_1 = new Director("Martin", "Scorsese", "American");
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Event Horizon", film_01.getTitle());
//    }
//
//    @Test
//    public void hasScript(){
//        assertEquals("The Horizon", film_01.getScript());
//    }
//
//    @Test
//    public void hasBudget(){
//        assertEquals(100, film_01.getBudget());
//    }
//
//    @Test
//    public void startsEmptyCast(){
//        assertTrue(film_01.getCast().isEmpty());
//    }
//
//    @Test
//    public void startsEmptyCrew(){
//        assertTrue(film_01.getCrew().isEmpty());
//    }
//
//    @Test
//    public void canAddCast(){
//        film_01.addPersonToFilm(actor_1);
//        assertEquals("Bob", film_01.getCast().get(0).getFirstName());
//    }
//
//    @Test
//    public void canAddCrew(){
//        film_01.addPersonToFilm(director_1);
//        assertEquals("Martin", film_01.getCrew().get(0).getFirstName());
//    }
//}
