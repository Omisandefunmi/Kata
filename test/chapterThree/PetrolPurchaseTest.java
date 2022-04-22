package chapterThree;

import chapter3.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    private PetrolPurchase petrolPurchase;
    @BeforeEach
    public void setUp(){
        petrolPurchase = new PetrolPurchase("Imo",
                "crude", 3, 3.89, 3);
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

        petrolPurchase.setPetrolType("crude");
        assertEquals("crude", petrolPurchase.getPetrolType());


    }

    @Test
    public void testThatPetrolClassHasQuantity(){

        petrolPurchase.setPetrolQuantity(3);
        assertEquals(3, petrolPurchase.getPetrolQuantity());


    }

    @Test
    public void testThatPetrolClassHasPrice(){

        petrolPurchase.setPetrolPrice(3.90);
        assertEquals(3.90, petrolPurchase.getPetrolPrice());

    }

    @Test
    public void testThatPetrolClassHasPercentageDiscount(){

        petrolPurchase.setPercentageDiscount(3);
        assertEquals(0.03, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testThatPetrolPurchaseConstructorExist(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("Imo",
                "crude", 3, 3.89, 3);
        assertNotNull(petrolPurchase);

    }



}
