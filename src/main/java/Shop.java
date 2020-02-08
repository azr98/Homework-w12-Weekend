import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private String location;


    public Shop(String name,String location, ArrayList<ISell> stock) {
        this.name = name;
        this.location = location;
        this.stock = stock;
    }

    public void addStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public int getStockSize(){
        return this.stock.size();
    }
}
