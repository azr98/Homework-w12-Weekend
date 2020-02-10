package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private String colour;
    private double sellingPrice;
    private double priceBought;
    private double weight;

    public Instrument(String material, String colour, double sellingPrice, double priceBought, double weight) {
        this.material = material;
        this.colour = colour;
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getWeight() {
        return weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double markup(){
        return this.sellingPrice - this.priceBought;
    }
}
