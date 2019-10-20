package deqo.afra.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getItem() {
        Item a = new Item(5);
        assertEquals("Test fail for 'getItem', bad item given",5,a.getItem());
    }

    @Test
    public void setItem() {
        Item a = new Item(5);
        a.setItem(10);
        assertEquals("Test fail for 'setItem', bad item finally",10,a.getItem());
    }
}