package sideitems;

import behaviours.ISell;

public class DrumStick implements ISell {

    private double sellingPrice;
    private double priceBought;
    private String colour;
    private int size;

    public DrumStick(double sellingPrice, double priceBought, String colour, int size) {
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
        this.colour = colour;
        this.size = size;
    }

    public double markup(){
        return this.sellingPrice - this.priceBought;
    }


}
