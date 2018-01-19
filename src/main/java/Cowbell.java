public class Cowbell implements IPlayable {

    String material;

    public Cowbell(String material) {
        this.material = material;
    }

    public void play(String sound) {

    }

    public String getMaterial() {
        return material;
    }
}
