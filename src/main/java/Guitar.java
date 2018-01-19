public class Guitar implements IPlayable{

    private int no_of_strings;
    private int pickups;
    private String fretboard_material;

    public Guitar(int no_of_strings, int pickups, String fretboard_material) {
        this.no_of_strings = no_of_strings;
        this.pickups = pickups;
        this.fretboard_material = fretboard_material;

    }

    public String play() {
        return "RIFFFFFFFS";
    }

    public int getNoOfStrings() {
        return no_of_strings;
    }

    public int getNoOfPickups() {
        return pickups;
    }

    public String getMaterial() {
        return fretboard_material;
    }
}
