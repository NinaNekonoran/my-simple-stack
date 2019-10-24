package deqo.afra.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StaticStackTest {
    StaticStack alors ;

    @Before
    public void setUp() throws Exception{
        alors = new StaticStack(5);
    }
    @Test
    public void isEmpty() throws Exception{
        assertTrue("not empty!",alors.isEmpty());
        alors.push(new Item(5.0));
        assertFalse("empty!",alors.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        alors.push(new Item(1.0));
        assertEquals("size not equals 1",1,alors.getSize());
        alors.push(new Item(2.0));
        assertEquals("size not equals 1",2,alors.getSize());
    }

    @Test(expected = Exception.class)
    public void push() throws Exception  {
        assertEquals("size not equals 0",0,alors.getSize());
        alors.push(new Item(4.0));
        assertEquals("size not equals 1",1,alors.getSize());
        Item aux = alors.peek();
        Double aux2 = aux.getItem();
        assertTrue(aux2 instanceof Double);
        assertEquals("item not equals 4",4,aux.getItem(),0);
        assertEquals("size not equals 1",1,alors.getSize());
        alors.push(new Item(4.0));
        alors.push(new Item(4.0));
        alors.push(new Item(4.0));
        alors.push(new Item(4.0));
        assertEquals("size not equals 5",5,alors.getSize());
        alors.push(new Item(6.0));
        assertEquals("size not equals 5",5,alors.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void peek() throws Exception {
        assertEquals("size not equals 0",0,alors.getSize());
        Item itemPush =new Item(4.0);
        alors.push(itemPush);
        assertEquals("size not equals 1",1,alors.getSize());
        Item itemPeek = alors.peek();
        assertEquals("size not equals 1",1,alors.getSize());
        assertTrue(itemPeek.getItem() instanceof Double);
        assertEquals("item not equals 4",itemPush.getItem(),itemPeek.getItem());
        assertEquals("item not equals 4",itemPush,itemPeek);
        assertEquals("size not equals 1",1,alors.getSize());
        alors.pop();

        Item itemPeek2 = alors.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void pop() throws Exception  {
        alors.push(new Item(4.0));
        Item aux = alors.pop();
        assertEquals("item not equals 4",4,aux.getItem(),0);
        assertEquals("size not equals 0",0,alors.getSize());
        Item itemPeek2 = alors.pop();
    }
}