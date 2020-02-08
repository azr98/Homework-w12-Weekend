package sideitems;

public class GuitarPick {

    private double sellingPrice;
    private double priceBought;
    private String colour;

    public GuitarPick(double sellingPrice, double priceBought, String colour) {
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
        this.colour = colour;
    }

    public double markup(){
        return this.sellingPrice - this.priceBought;
    }

}
