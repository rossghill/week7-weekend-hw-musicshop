package Accessories;

public class SheetMusic implements ISell{

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
