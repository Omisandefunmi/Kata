package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {


    @Test
    public void fillAllIndicesOfArray(){
        boolean [] array = new boolean[10];
        assertFalse(array[8]);

    }

    @Test
    public void capitalizeFirstStringTest(){
        String string = Kata.capitalizeFirstLetter("sweden");
        assertEquals("Sweden", string);
    }

    @Test
    public void addFullStop(){
        String string = Kata.addFullStop("olufunmi");
        assertEquals("olufunmi.", string);
    }

    @Test
    public void capitalizeFirstLetter_addFullStop(){
        String string = Kata.capitalizeStringAddFullStop("olufunmi chidinma");
        assertEquals("Olufunmi chidinma.", string);
    }



}
