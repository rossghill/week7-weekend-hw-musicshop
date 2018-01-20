public class Saxophone  extends Instrument implements IPlayable{

    String type;

    public Saxophone(String colour, int neighbour_annoyance_level, String type) {
        super(colour, neighbour_annoyance_level);
        this.type = type;
    }

    public String play() {
        return "SOUND OF SWING MUSIC BEING PLAYED";
    }

    public String getType() {
        return type;
    }
}
