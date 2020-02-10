package instruments;

public class Guitar extends Instrument {

    int numOfStrings;

    public Guitar(String material, String colour, double sellingPrice, double priceBought, double weight, int numOfStrings) {
        super(material, colour, sellingPrice, priceBought, weight);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(){
        return "kneeoow kneoow";
    }
}
