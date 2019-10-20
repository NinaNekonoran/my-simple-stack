package deqo.afra.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        alors.push(new Item(5));
        assertFalse("empty!",alors.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        alors.push(new Item(1));
        assertEquals("size not equals 1",1,alors.getSize());
        alors.push(new Item(2));
        assertEquals("size not equals 1",2,alors.getSize());
    }

    @Test
    public void push() throws Exception  {
        assertEquals("size not equals 0",0,alors.getSize());
        alors.push(new Item(4));
        assertEquals("size not equals 1",1,alors.getSize());
        Item aux = alors.peek();
        Integer aux2 = aux.getItem();
        assertTrue(aux2 instanceof Integer);
        assertEquals("item not equals 4",4,(int)aux.getItem());
        assertEquals("size not equals 1",1,alors.getSize());
        alors.push(new Item(4));
        alors.push(new Item(4));
        alors.push(new Item(4));
        alors.push(new Item(4));
        assertEquals("size not equals 5",5,alors.getSize());
        try {
            alors.push(new Item(6));
        }catch (Exception e){}
        assertEquals("size not equals 5",5,alors.getSize());
    }

    @Test
    public void peek() throws Exception {
        assertEquals("size not equals 0",0,alors.getSize());
        Item itemPush =new Item(4);
        alors.push(itemPush);
        assertEquals("size not equals 1",1,alors.getSize());
        Item itemPeek = alors.peek();
        assertEquals("size not equals 1",1,alors.getSize());
        assertTrue(itemPeek.getItem() instanceof Integer);
        assertEquals("item not equals 4",itemPush.getItem(),itemPeek.getItem());
        assertEquals("item not equals 4",itemPush,itemPeek);
        assertEquals("size not equals 1",1,alors.getSize());
        alors.pop();
        try{
            Item itemPeek2 = alors.peek();
        }catch (Exception e){}
    }

    @Test
    public void pop() throws Exception  {
        alors.push(new Item(4));
        Item aux = alors.pop();
        assertEquals("item not equals 4",4,(int)aux.getItem());
        assertEquals("size not equals 0",0,alors.getSize());
        try{
            Item itemPeek2 = alors.pop();
        }catch (Exception e){}
    }
}