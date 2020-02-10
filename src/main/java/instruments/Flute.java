package instruments;

public class Flute extends Instrument {

    private int numOfHoles;

    public Flute(String material, String colour, double sellingPrice, double priceBought, double weight, int numOfHoles) {
        super(material, colour, sellingPrice, priceBought, weight);
        this.numOfHoles = numOfHoles;
    }

    public int getNumOfHoles() {
        return numOfHoles;
    }

    public String play(){
        return "ooooo oooo";
    }
}
