import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar fenderStrat;
    Guitar gibsonSG;

    @Before
    public void before() {
        fenderStrat = new Guitar(6,2, "rosewood");
        gibsonSG = new Guitar(6,3, "pine");
    }

    @Test
    public void hasStrings() {
        assertEquals(6, fenderStrat.getNoOfStrings());
    }

    @Test
    public void hasPickups() {
        assertEquals(3, gibsonSG.getNoOfPickups());
    }

    @Test
    public void hasFretboardMaterial() {
        assertEquals("rosewood", fenderStrat.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("RIFFFFFFFS", fenderStrat.play());
    }

}
