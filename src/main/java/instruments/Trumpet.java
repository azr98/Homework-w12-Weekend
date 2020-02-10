package instruments;

public class Trumpet extends Instrument {

    private int numOfValves;

    public Trumpet(String material, String colour, double sellingPrice, double priceBought, double weight, int numOfValves) {
        super(material, colour, sellingPrice, priceBought, weight);
        this.numOfValves = numOfValves;
    }

    public String play(){
        return "Booo booo";
    }
}
