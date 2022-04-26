package chapterThree;

import chapter3.PetrolPurchase;
import chapter3.PetrolType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    private PetrolPurchase petrolPurchase;
    @BeforeEach
    public void setUp(){
        petrolPurchase = new PetrolPurchase("Imo", PetrolType.KEROSENE, 3, 3.89, 3);
    }

    @Test
    public void testThatPetrolClassExist(){

        assertNotNull(petrolPurchase);

    }

    @Test
    public void testThatPetrolClassHasStationLocation(){

        petrolPurchase.setStationLocation("Imo");
        assertEquals("Imo", petrolPurchase.getStationLocation());


    }

    @Test
    public void testThatPetrolClassHasType(){

        petrolPurchase.setPetrolType(PetrolType.DIESEL);
        assertEquals(PetrolType.DIESEL, petrolPurchase.getPetrolType());


    }

    @Test
    public void testThatPetrolClassTypeIsLimitedToThreeTypes(){

        petrolPurchase.setPetrolType(PetrolType.PMS);
        assertEquals(PetrolType.PMS, petrolPurchase.getPetrolType());


    }

    @Test
    public void testThatPetrolClassHasQuantity(){

        petrolPurchase.setPetrolQuantity(3);
        assertEquals(3, petrolPurchase.getPetrolQuantity());


    }

    @Test
    public void testThatPetrolQuantityCannotBeZero(){

        petrolPurchase.setPetrolQuantity(0);
        assertEquals(3, petrolPurchase.getPetrolQuantity());


    }

    @Test
    public void testThatPetrolQuantityCannotBeNegativeNumber(){

        petrolPurchase.setPetrolQuantity(-1);
        assertEquals(3, petrolPurchase.getPetrolQuantity());


    }

    @Test
    public void testThatPetrolClassHasPrice(){

        petrolPurchase.setPetrolPrice(3.90);
        assertEquals(3.90, petrolPurchase.getPetrolPrice());

    }

    @Test
    public void testThatPetrolPriceCanBeLessThanZero(){

        petrolPurchase.setPetrolPrice(0);
        assertEquals(3.89, petrolPurchase.getPetrolPrice());

    }

    @Test
    public void testThatPetrolClassHasPercentageDiscount(){

        petrolPurchase.setPercentageDiscount(3);
        assertEquals(3, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testThatPetrolPurchaseConstructorExist(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("Imo",
                PetrolType.KEROSENE, 3, 3.89, 3);
        assertEquals("Imo",petrolPurchase.getStationLocation());
        assertEquals(PetrolType.KEROSENE, petrolPurchase.getPetrolType());
        assertEquals( 3, petrolPurchase.getPetrolQuantity());
        assertEquals( 3.89, petrolPurchase.getPetrolPrice());
        assertEquals( 3, petrolPurchase.getPercentageDiscount());

    }

    @Test
    public void testThatPurchaseAmountCanBeCalculated(){
        petrolPurchase.setPetrolQuantity(3);
        petrolPurchase.setPetrolPrice(100);
        petrolPurchase.setPercentageDiscount(10);
        assertEquals(270, petrolPurchase.getPurchaseAmount());
    }


}
