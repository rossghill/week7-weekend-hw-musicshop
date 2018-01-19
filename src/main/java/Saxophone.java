public class Saxophone implements IPlayable{

    String type;

    public Saxophone(String type) {
        this.type = type;
    }

    public String play() {
        return "SOUND OF SWING MUSIC BEING PLAYED";
    }

    public String getType() {
        return type;
    }
}
