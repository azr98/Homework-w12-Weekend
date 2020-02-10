package instruments;

public class Piano extends Instrument {

    private int numOfKeys;

    public Piano(String material, String colour, double sellingPrice, double priceBought, double weight, int numOfKeys) {
        super(material, colour, sellingPrice, priceBought, weight);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play(){
        return "ping ping";
    }
}
