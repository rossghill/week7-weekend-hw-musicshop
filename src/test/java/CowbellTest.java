import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowbellTest {

    Cowbell cowbell;

    @Before
    public void before() {
        cowbell = new Cowbell("copper",7,"Brass");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", cowbell.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("CLANK CLANK", cowbell.play());
    }
}
