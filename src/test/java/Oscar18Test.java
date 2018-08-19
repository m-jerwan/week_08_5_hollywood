//import javassist.expr.Cast;
//import models.Award.CategoriesType;
//import models.Award.Oscar;
//import models.Award.Oscar18;
//import models.Cast.Actor;
//import org.junit.Before;
//import org.junit.Test;
//
//import static junit.framework.Assert.assertEquals;
//
//public class Oscar18Test {
//    Actor actor_1;
//    Actor actor_2;
//    Oscar oscarBestActor;
//
//    @Before
//    public void before(){
//        actor_1 = new Actor("Bob", "Hoskins", "American", true);
//        actor_2 = new Actor("Leo", "DiCaprio", "American", false);
//        oscarBestActor = new Oscar(CategoriesType.ACTOR);
//    }
//
//    @Test
//    public void hasCategory(){
//        assertEquals("Best leading actor", oscarBestActor.getCategory().getDescription());
//    }
//
//    @Test
//    public void canSetCategory(){
//        oscarBestActor.setCategory(CategoriesType.ACTOR);
//            assertEquals("Best leading actor", oscarBestActor.getCategory().getDescription());
//    }
//
//    @Test
//    public void hasCountry(){
//        assertEquals("US", oscarBestActor.getCountry());
//    }
//
//    @Test
//    public void canChangeCountry(){
//        oscar18BestActor.setCountry("United States of America");
//        assertEquals("United States of America", oscarBestActor.getCountry());
//    }
//
//
//}
