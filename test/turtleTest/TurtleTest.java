package turtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle turtle;

    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
    }
    @Test
    public void testThatTurtleExists(){
        assertNotNull(turtle);
    }

    @Test
    public void testThatTurtlePenIsUpByDefault(){
        boolean isPenDown = turtle.isPenDown();
        assertFalse(isPenDown);
    }

    @Test
    public void turtleCanMovePenDownTest() {
//        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);
    }

//    @Test
//    public void turtleCanTurnLeftTest(){
//        turtle.penDown();
//        boolean isPenRight = turtle.isPenRight(3);
//        assertTrue(isPenRight);
//    }

}
