public class Cowbell implements IPlayable {

    String material;

    public Cowbell(String material) {
        this.material = material;
    }

    public String play() {
        return "CLANK CLANK";
    }

    public String getMaterial() {
        return material;
    }
}
