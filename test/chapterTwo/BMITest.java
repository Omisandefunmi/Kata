package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BMITest {
    @Test
    public void testThatBMIClassExists(){
        BMI bmi = new BMI();

        assertNotNull(bmi);
    }

    @Test
    public void testThatBMIHasWeight(){
        BMI bmi = new BMI();
        bmi.setWeight(32.5);
        assertEquals(32.5, bmi.getWeight());
    }

    @Test
    public void testThatBMIHasHeight(){
        BMI bmi = new BMI();
        bmi.setHeight(45);
        assertEquals(45, bmi.getHeight());
    }

    @Test
    public void testThatBMICanBeCalculated_withWeightInkG(){
        BMI bmi = new BMI();
        bmi.setHeight(3.0);
        bmi.setWeight(9.0);
        assertEquals(1, bmi.calculateBMIForWeightInKG());
    }

    @Test
    public void testThatBMICanBeCalculated_withWeightInPounds(){
        BMI bmi = new BMI();
        bmi.setHeight(3.0);
        bmi.setWeight(9.0);
        assertEquals(703, bmi.calculateBMIForWeightInPounds());
    }

    @Test
    public void testThatWeightCantBeNegative(){
        BMI bmi = new BMI();
        bmi.setWeight(-7);
        assertEquals(0, bmi.getWeight());

    }

    @Test
    public void testThatHeightCantBeNegative(){
        BMI bmi = new BMI();
        bmi.setHeight(-7);
        assertEquals(0, bmi.getHeight());

    }

    @Test
    public void testToCalculateBMI(){
        BMI bmi = new BMI();
        bmi.setWeight(91);
        bmi.setHeight(4.10);

    }




}
