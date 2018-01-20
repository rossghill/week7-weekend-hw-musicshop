package Accessories;

public class GuitarStrings implements ISell {

    String description;
    double buyingPrice;
    double sellingPrice;

    public GuitarStrings(String description, double buyingPrice, double sellingPrice) {
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
