import instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    private Flute flute;

    @Before
    public void before(){
        flute = new Flute("Nickel", "Silver", 50, 30, 0.50,8 );
    }

    @Test
    public void hasMaterial(){
        assertEquals("Nickel", flute.getMaterial());
    }

@Test
    public void hasColour(){
        assertEquals("Silver",flute.getColour());
    }

@Test
    public void hasSellPrice(){
        assertEquals(50, flute.getSellingPrice(),2d);
    }

@Test
    public void hasPriceBought(){
        assertEquals(30, flute.getPriceBought(),2d);
    }

@Test
    public void hasWeight(){
        assertEquals(0.50,flute.getWeight(),2d);
    }

@Test
    public void hasNumOfHoles(){
        assertEquals(8, flute.getNumOfHoles(),2d);
    }

    @Test
    public void canPlay(){
        assertEquals("ooooo oooo", flute.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(20 , flute.markup(),2d);
    }

}
