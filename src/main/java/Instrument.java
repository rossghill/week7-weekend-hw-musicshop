public abstract class Instrument {

    String colour;
    int neighbour_annoyance_level;

    public Instrument(String colour, int neighbour_annoyance_level) {
        this.colour = colour;
        this.neighbour_annoyance_level = neighbour_annoyance_level;
    }

    public String getColour() {
        return colour;
    }

    public int getNeighbour_annoyance_level() {
        return neighbour_annoyance_level;
    }
}
