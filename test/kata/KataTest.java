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

    @Test
    public void convertToKelvinTest(){
        double kelvinTemperature = Kata.convertToKelvin(10.0);
        assertEquals(283.15, kelvinTemperature);

    }

    @Test
    public void convertToCelsiusTest(){
        double celsius = Kata.convertToCelsius(10.0);
        assertEquals(-263.15, celsius);
    }

    @Test
    public void fillArray(){
        int [] result = Kata.fillIntegerArray(10,-1);
        assertEquals(-1, result[6]);

    }

//    @Test
//    public void replaceElementsInArray(){
//        int [] array = new int[10];
//        array[0] = Kata.replaceElementsInArray(-1, 8);
//        assertEquals(8, array[0]);
//    }



}
