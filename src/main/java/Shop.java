import Accessories.ISell;

import java.util.ArrayList;

public class Shop<ISell> implements Accessories.ISell{

    ArrayList<ISell> stock;

    public Shop(){
    this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }

    public void addItem(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public void removeItems() {
        this.stock.clear();
    }

    public double getBuyingPrice() {
        return 0;
    }

    public double getSellingPrice() {
        return 0;
    }

    public double calculateMarkup() {
        return 0;
    }

//    public double getTotalProfit() {
//
//    }
//

}
