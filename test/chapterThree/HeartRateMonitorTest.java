package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRateMonitorTest {
    public HeartRateMonitor heartRateMonitor;
    @BeforeEach
    public void setUp(){
        heartRateMonitor = new HeartRateMonitor();
    }



    @Test
    public void testThatHeartRateMonitorClassExist() {

        assertNotNull(heartRateMonitor);

    }

    @Test
    public void testThatHeartMonitorHasFirstName(){
        heartRateMonitor.setFirstName("Wale");
        assertEquals("Wale",heartRateMonitor.getFirstName());

    }

    @Test
    public void testFirstNameCanNotBeEmpty(){
        heartRateMonitor.setFirstName("");
        assertNull(heartRateMonitor.getFirstName());

    }

    @Test
    public void testThatHeartMonitorHasSecondName(){
        heartRateMonitor.setSecondName("Yinka");
        assertEquals("Yinka", heartRateMonitor.getSecondName());
    }

    @Test
    public void testSecondNameCanNotBeEmpty() {
        heartRateMonitor.setSecondName("");
        assertNull(heartRateMonitor.getSecondName());
    }

    @Test
    public void testThatHeartMonitorHasName(){
        heartRateMonitor.setName("Wale","Yinka" );

        assertEquals("Wale Yinka",heartRateMonitor.getName());
    }

//    @Test
//    public void testThatHeartMonitorDateOfBirth(){
//        heartRateMonitor.setDateOfBirth(4, 6, 2020);
//        assertEquals();
//
//
//    }

}
