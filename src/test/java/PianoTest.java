import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(88, "Mini Grand");
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasType() {
        assertEquals("Mini Grand", piano.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("TINKLING OF KEYS", piano.play());
    }

}
