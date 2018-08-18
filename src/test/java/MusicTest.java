import models.Crew.Music;
import models.Crew.Writer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MusicTest {
    Music music_1;


    @Before
    public void before(){
        music_1 = new Music("John", "Malkovitch", "Jamaican", "Suspenful music");
    }

    @Test
    public void hasScript(){
        assertEquals("Suspenful music", music_1.getScore());
    }

    @Test
    public void setMusic_1(){
        music_1.setScore("Calming music");
        assertEquals("Calming music", music_1.getScore());
    }

}

