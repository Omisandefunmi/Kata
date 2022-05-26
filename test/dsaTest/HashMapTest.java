package dsaTest;


import dsa.HashMapAgain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
    private HashMapAgain hashMapAgain;

    @BeforeEach
    public void alwaysStartWith(){
        hashMapAgain = new HashMapAgain();
    }
    @Test
    public void hashMapExist(){
        assertNotNull(hashMapAgain);
    }

    @Test
    public void hashMapCanAddItemsByKeyAndValue(){
        hashMapAgain.put("Gender", "male");
        assertEquals(1, hashMapAgain.size());
    }
    @Test
    public void hashMapCanAddMultipleItemsByKeyAndValue(){
        hashMapAgain.put("Gender", "male");
        hashMapAgain.put("food", "eggs");
        hashMapAgain.put("fruit", "apple");
        assertEquals(3, hashMapAgain.size());
    }

    @Test
    public void hashMapCanFindAddedItemsByKey(){
        hashMapAgain.put("hubby", "ijoye");
        String element = hashMapAgain.get("hubby");
        assertEquals("ijoye", element);
    }

    @Test
    public void hashMapCanNotHaveDuplicateKeys(){
        hashMapAgain.put("hubby", "Ijoye");
        hashMapAgain.put("wife", "baby");
        hashMapAgain.put("first kid", "eddie");
        hashMapAgain.put("parent", "unik");
        hashMapAgain.put("wife", "iren");
        assertEquals(4, hashMapAgain.size());
    }

    @Test
    public void hashMapCanFindAddedItemsByValue(){
        hashMapAgain.put("hubby", "ijoye");
        String element = hashMapAgain.getByValue("ijoye");
        assertEquals("hubby", element);
    }

    @Test
    public void hashMapCanCheckIfKeyExist(){
        hashMapAgain.put("hubby", "Ijoye");
        hashMapAgain.put("wife", "baby");
        hashMapAgain.put("first kid", "eddie");
        boolean result = hashMapAgain.containsKey("first kid");
        assertTrue(result);
        boolean result2 = hashMapAgain.containsKey("kid");
        assertFalse(result2);
    }

    @Test
    public void testThatHashMapCanReplace(){
        hashMapAgain.put("hubby", "Ijoye");
        hashMapAgain.put("wife", "baby");
        hashMapAgain.put("first kid", "eddie");
        hashMapAgain.replace("hubby", "Ijoye", "chief");
        assertEquals("chief", hashMapAgain.get("hubby"));
    }
    @Test public void otunbaTest(){
        hashMapAgain.put("hubby", "Ijoye");
        hashMapAgain.put("wife", "baby");
        hashMapAgain.put("first kid", "eddie");
        hashMapAgain.put("hubby", "otunba");
        hashMapAgain.put("Hubby", "johel");
        assertEquals("johel", hashMapAgain.get("Hubby"));
    }

}
