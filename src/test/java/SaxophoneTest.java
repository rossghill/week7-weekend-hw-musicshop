import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Tenor");
    }

    @Test
    public void hasType() {
        assertEquals("Tenor", saxophone.getType());
    }
}
