package dsaTest;

import dsa.HashMapSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapSetTest {
    private HashMapSet map;

    @BeforeEach
    public void alwaysStartWith(){
        map = new HashMapSet();
    }

    @Test
    public void testThatHashMapSetExists(){
        assertNotNull(map);
    }

    @Test
    public void testThatHashMapIsEmpty(){
        assertEquals(0, map.size());
    }

    @Test
    public void testThatHashMapCanPutKeyAndValue(){
        map.put("Name", "John");
        assertEquals(1, map.size());
    }

    @Test
    public void testThatHashMapCanCheckIfItContainsKey(){
        map.put("name", "ears");
        assertTrue(map.containsKey("name"));
    }

}
