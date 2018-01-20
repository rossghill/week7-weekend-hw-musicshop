public class Cowbell  extends Instrument implements IPlayable {

    String material;

    public Cowbell(String colour, int neighbour_annoyance_level, String material) {
        super(colour, neighbour_annoyance_level);
        this.material = material;
    }

    public String play() {
        return "CLANK CLANK";
    }

    public String getMaterial() {
        return material;
    }
}
