package deqo.afra.mysimplestack;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StaticStackTest {

    @Test
    public void isEmpty() {
        StaticStack alors = new StaticStack(5);
        assertTrue("not empty!",alors.isEmpty());
        alors.push(new Item(5));
        assertFalse("empty!",alors.isEmpty());
    }

    @Test
    public void getSize() {
        StaticStack alors = new StaticStack(5);
        alors.push(new Item(1));
        assertEquals("size not equals 1",1,alors.getSize());
        alors.push(new Item(2));
        assertEquals("size not equals 1",2,alors.getSize());
    }

    @Test
    public void push() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void pop() {
    }
}