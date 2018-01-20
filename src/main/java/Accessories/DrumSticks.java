package Accessories;

public class DrumSticks implements ISell{


    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
