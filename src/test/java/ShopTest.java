import Accessories.DrumSticks;
import Accessories.ISell;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop<ISell> stock;
    DrumSticks drumsticks;

    @Before
    public void before() {
        stock = new Shop<>();
        drumsticks = new DrumSticks("Wooden sticks",2.50, 4.00);
    }

    @Test
    public void stockIsEmpty() {
        assertEquals(0, stock.stockCount());
    }

    @Test
    public void addToStock() {
        stock.addItem(drumsticks);
        assertEquals(1, stock.stockCount());
    }

}
