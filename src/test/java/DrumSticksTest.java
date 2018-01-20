import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

   @Before
    public void before() {
       drumSticks = new DrumSticks(2.50, 4.00);
   }

   @Test
    public void hasBuyingPrice() {
       assertEquals(2.50, drumSticks.getBuyingPrice(),0.01);
   }

   @Test
    public void getSellingPrice() {
       assertEquals(4.00, drumSticks.getSellingPrice(), 0.01);
   }

   @Test
    public void canCalculateMarkup() {
       assertEquals(1.50, drumSticks.calculateMarkup(),0.01);
   }
}
