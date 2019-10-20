package deqo.afra.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StaticStack implements SimpleStack {

    ArrayList<Item> monTab;
    int capacity;

    public StaticStack(int capacity) {
        this.capacity = capacity;
        this.monTab = new ArrayList<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return monTab.isEmpty();
    }

    @Override
    public int getSize() {
        return monTab.size();
    }

    @Override
    public void push(Item item) throws Exception{
        if(monTab.size()<capacity)
            monTab.add(item);
        else throw new Exception("Size max");
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(!monTab.isEmpty())
            return monTab.get(0);
        else
           throw new EmptyStackException();
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(monTab.isEmpty())
            throw new EmptyStackException();
        Item aux = monTab.get(0);
        monTab.remove(0);
        return aux;
    }
}
