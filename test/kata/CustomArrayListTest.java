package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomArrayListTest {

    private CustomArrayList customArrayList;

    @BeforeEach
    public void alwaysStartWith(){
        customArrayList = new CustomArrayList();
    }
    @Test
    public void testThatMyArrayListExist(){
        CustomArrayList myArrayList = new CustomArrayList();
        assertNotNull(myArrayList);
    }

    @Test
    public void testThatMyArrayListCanAdd(){
        CustomArrayList myArrayList = new CustomArrayList();
        myArrayList.add("See");
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void testThatMyArrayListCanGetElementItContains(){
        customArrayList.add("see");
        customArrayList.add("look");
        customArrayList.add("seen");
        String result = customArrayList.get(1);
        assertEquals("see", result);
    }

    @Test
    public void testThatMyArrayListCanRemoveItems(){
        customArrayList.add("die");
        customArrayList.add("lie");
        customArrayList.add("live");
        String result = customArrayList.removeBy(2);
        assertEquals(2, customArrayList.size());
        assertEquals("lie", result);
    }

    @Test
    public void testThatMyArrayListRemovedItemIndexIsNotNull(){
        customArrayList.add("die");
        customArrayList.add("lie");
        customArrayList.add("live");
        String result = customArrayList.removeBy(2);
        assertEquals(2, customArrayList.size());
        assertEquals("lie", result);
        assertNotNull(customArrayList.get(2));
    }

    @Test
    public void testThatMyArrayListCanExpand(){
        customArrayList.add("1");
        customArrayList.add("1");
        customArrayList.add("1");
        customArrayList.add("1");
        customArrayList.add("1");
        customArrayList.add("1");
        assertEquals(6, customArrayList.size());
    }

    @Test
    public void testThatMyArrayListCanAddByElementAndIndex() {
        customArrayList.add("1");
        customArrayList.add("2");
        customArrayList.add("3");
        customArrayList.add(2, "4");
        assertEquals(4, customArrayList.size());
    }
}
