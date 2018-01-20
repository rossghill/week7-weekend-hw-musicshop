import Accessories.DrumSticks;
import Accessories.GuitarStrings;
import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellablesTest {

    DrumSticks drumSticks;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;
    Cowbell cowbell;

   @Before
    public void before() {
       drumSticks = new DrumSticks("Wooden sticks",2.50, 4.00);
       sheetMusic = new SheetMusic("Best of Sir Mixalot arranged for Harpsichord",1.25, 12.00);
       guitarStrings = new GuitarStrings("Ernie Ball Super Slinkys",3.75, 4.85);
       cowbell = new Cowbell("Blue Oyster Cowbell", 4,"Titanium", 18.00, 24.00);
   }

   @Test
    public void hasBuyingPrice() {
       assertEquals(2.50, drumSticks.getBuyingPrice(),0.01);
       assertEquals(1.25, sheetMusic.getBuyingPrice(),0.01);
       assertEquals(3.75, guitarStrings.getBuyingPrice(),0.01);
       assertEquals(18.00, cowbell.getBuyingPrice(),0.01);
   }

   @Test
    public void hasSellingPrice() {
       assertEquals(4.00, drumSticks.getSellingPrice(), 0.01);
       assertEquals(12.00, sheetMusic.getSellingPrice(), 0.01);
       assertEquals(4.85, guitarStrings.getSellingPrice(), 0.01);
       assertEquals(24.00, cowbell.getSellingPrice(), 0.01);
   }

   @Test
    public void canCalculateMarkup() {
       assertEquals(1.50, drumSticks.calculateMarkup(),0.01);
       assertEquals(10.75, sheetMusic.calculateMarkup(),0.01);
       assertEquals(1.10, guitarStrings.calculateMarkup(),0.01);
       assertEquals(6.00, cowbell.calculateMarkup(),0.01);
   }
}
