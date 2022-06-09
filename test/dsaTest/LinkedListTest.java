package dsaTest;

import dsa.LinkedList;
import dsa.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LinkedListTest {
    private LinkedList linked;

    @BeforeEach
    public void alwaysStartWith(){
    linked = new LinkedList();}

    @Test
    public void testThatLinkedListExists(){
        assertNotNull(linked);
    }

    @Test
    public void testThatLinkedListIsEmpty(){
        assertEquals(0, linked.size());
    }

    @Test
    public void testThatLinkedListCanAddItems(){
        linked.add("Lagos");
        assertEquals(1, linked.size());
    }

    @Test
    public void testThatLinkedListCanAddAndQueryNodes(){
        linked.add("abuja");
        linked.add("meiran");
        linked.add("jug");
        assertEquals(3, linked.size());
        String found = linked.get(2);
        assertEquals("meiran", found);
    }



}
