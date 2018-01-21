import Accessories.ISell;

import java.util.ArrayList;

public class Shop<ISell> {

    ArrayList<ISell> stock;

    public Shop(){
    this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }

//    public double getTotalProfit() {
//
//    }
//

}
