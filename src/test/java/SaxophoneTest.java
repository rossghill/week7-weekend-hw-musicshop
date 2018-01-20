import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone sax;

    @Before
    public void before() {
        sax = new Saxophone("gold",8,"Tenor");
    }

    @Test
    public void hasType() {
        assertEquals("Tenor", sax.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("SOUND OF SWING MUSIC BEING PLAYED", sax.play());
    }
}
