import Accessories.ISell;

public class Cowbell  extends Instrument implements IPlayable, ISell {

    String material;
    double buyingPrice;
    double sellingPrice;

    public Cowbell(String colour, int neighbour_annoyance_level, String material, double buyingPrice, double sellingPrice) {
        super(colour, neighbour_annoyance_level);
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String play() {
        return "CLANK CLANK";
    }

    public String getMaterial() {
        return material;
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
