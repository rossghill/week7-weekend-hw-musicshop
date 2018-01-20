package Accessories;

public class SheetMusic implements ISell{

    String description;
    double buyingPrice;
    double sellingPrice;

    public SheetMusic(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
