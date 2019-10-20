package deqo.afra.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Integer a;
    Item b;

    @Before
    public void setUp(){
        a = 5;
        b = new Item(a);
    }

    @Test
    public void getItem() {
        assertEquals("Test fail for 'getItem', bad item given",a,b.getItem());
    }

    @Test
    public void setItem() {
        Integer c = 10;
        b.setItem(c);
        assertEquals("Test fail for 'setItem', bad item finally",c,b.getItem());
    }
}