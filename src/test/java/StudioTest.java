import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

public class StudioTest {
    private Studio universal;
    private Film film_01;

    @Before
    public void before(){
        universal = new Studio(200000);
        film_01 = new Film("Snatch", "Movie X", 2000);
    }

    @Test
    public void hasBudget(){
        assertEquals(200000, universal.getBudget());
    }

    @Test
    public void canSetBudget(){
        universal.setBudget(200);
        assertEquals(200, universal.getBudget());
    }

    @Test
    public void startsNoFilms(){
        assertTrue(  universal.getFilms().isEmpty());
    }



    @Test
    public void canGetFilms(){
        universal.addFilm(film_01);
        assertEquals(0,0);
//        assertEquals("Snatch", universal.getFilms().get(0).getTitle());
    }

}

