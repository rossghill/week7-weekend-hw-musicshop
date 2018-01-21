import Accessories.ISell;
import org.junit.Before;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShopTest {

    Shop<ISell> stock;

    @Before
    public void before() {
        stock = new Shop<>();
    }
}
