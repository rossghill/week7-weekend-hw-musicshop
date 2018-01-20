public class Piano extends Instrument implements IPlayable{

    private int no_of_keys;
    private String type;

    public Piano(String colour, int neighbour_annoyance_level, int no_of_keys, String type) {
        super(colour, neighbour_annoyance_level);
        this.no_of_keys = no_of_keys;
        this.type = type;
    }

    public String play() {
        return "TINKLING OF KEYS";
    }

    public int getKeys() {
        return no_of_keys;
    }

    public String getType() {
        return type;
    }
}
