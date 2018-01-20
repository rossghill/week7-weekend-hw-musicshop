package Accessories;

public class GuitarStrings implements ISell {

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
