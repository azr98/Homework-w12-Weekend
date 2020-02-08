package sideitems;

public class SheetMusic {

    private double sellingPrice;
    private double priceBought;
    private String genre;

    public SheetMusic(double sellingPrice, double priceBought, String genre ) {
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
        this.genre = genre;

    }

    public double markup(){
        return this.sellingPrice - this.priceBought;
    }
}
