import Accessories.ISell;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop<ISell> stock;

    @Before
    public void before() {
        stock = new Shop<>();
    }

    @Test
    public void stockIsEmpty() {
        assertEquals(0, stock.stockCount());
    }
}
