import behaviours.ISell;
import instruments.Flute;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Flute flute;
    private Guitar guitar;
    private Piano piano;
    private Shop shop;
    private ArrayList<ISell> stock;

    @Before
    public void before(){
        flute = new Flute("Nickel", "Silver", 50, 30, 0.50,8 );
        guitar = new Guitar("Wood","Red",100,80,3.6,6);
        stock = new ArrayList<ISell>();

        piano = new Piano("Cast Iron", "Black", 200,150,200, 88);

        stock.add(flute);
        stock.add(guitar);
        shop = new Shop("Slatt music","Glasgow",stock);
    }

    @Test
    public void hasStock(){
        assertEquals(2, stock.size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(piano);
        assertEquals(3, shop.getStockSize());
    }

    @Test
    public void canRemoveStock(){
        shop.removeStock(flute);
        assertEquals(1, shop.getStockSize());
    }
}
