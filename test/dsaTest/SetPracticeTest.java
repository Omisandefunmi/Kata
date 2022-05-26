package dsaTest;

import dsa.SetPractice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SetPracticeTest {
    private SetPractice set;

    @BeforeEach
    public void setUp(){
        set= new SetPractice();
    }
    @Test
    public void testThatSetExists(){
        assertNotNull(set);
    }

    @Test
    public void testThatSetIsEmpty(){
        assertFalse(set.isFull());
    }

    @Test
    public void testThatSetCanAddItem(){
        set.add("23");
        assertFalse(set.isFull());
        assertEquals(1, set.size());
        assertEquals("23", set.get(1));
    }

    @Test
    public void testThatSetCanNotTakeDuplicateElements(){
        set.add("34");
        set.add("40");
        set.add("34");
        set.add("39");
        set.add("34");
        assertEquals(3, set.size());

    }

    @Test
    public void testThatSetCanCheckItsElements(){
        set.add("34");
        set.add("40");
        set.add("34");
        boolean result = set.contains("34");
        boolean result2 = set.contains("100");
        assertTrue(result);
        assertFalse(result2);
    }

    @Test
    public void testCanWipeOffAllItsElements(){
        set.add("34");
        set.add("40");
        set.add("31");
        set.add("60");
        set.add("32");
        assertEquals(5, set.size());
    }
}
