import models.Crew.Writer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WriterTest {
    Writer writer_1;


    @Before
    public void before(){
        writer_1 = new Writer("John", "Malkovitch", "Jamaican", "Wrath of Jedi");
    }

    @Test
    public void hasScript(){
        assertEquals("Wrath of Jedi", writer_1.getScript());
    }

    @Test
    public void setScript(){
        writer_1.setScript("Jedi strikes Back");
        assertEquals("Jedi strikes Back", writer_1.getScript());

    }

}
