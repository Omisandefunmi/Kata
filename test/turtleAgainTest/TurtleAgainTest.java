package turtleAgainTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleAgain.Direction;
import turtleAgain.TurtleAgain;
import turtleAgain.TurtlePosition;


import static org.junit.jupiter.api.Assertions.*;


public class TurtleAgainTest {
    private TurtleAgain turtle;

    @BeforeEach
    public void alwaysStartWith() {
        turtle = new TurtleAgain();
    }

    @Test
    public void testThatTurtleExists() {
        assertNotNull(turtle);
    }

    @Test
    public void testThatTurtlePenIsUpByDefault() {
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testThatWhenTurtlePenIsDown_PenIsUpBecomesFalse() {
        turtle.putPenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testThatTurtlePenCanBePutUp_Down_AndUpAgain() {
        turtle.putPenDown();
        turtle.putPenUp();
        assertTrue(turtle.isPenUp());

    }

    @Test
    public void testThatPenFacesEastByDefault() {
        assertEquals(Direction.EAST, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatTurtleCanTurnPenToTheRight() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatTurtleCanTurnPenToTheRightTwice() {
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.checkCurrentPenDirection());
    }


    @Test
    public void testThatTurtleCanTurnPenToTheRightThrice() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatTurtleCanTurnPenToTheRightFourTimes() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatIfTurtlePenTurnsRightFiveTimes_CurrentDirectionIsSouth() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatTurtleCanTurnPenToTheLeft() {
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatIfTurtlePenTurnsLeftTwice_CurrentDirectionWillBeWest() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatIfTurtlePenTurnsLeftThrice_CurrentDirectionWillBeSouth() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatIfTurtlePenTurnsLeftFourTimes_CurrentDirectionWillBeEast() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatIfTurtlePenTurnsLeftFiveTimes_CurrentDirectionWillBeNorth() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.checkCurrentPenDirection());
    }

    @Test
    public void testThatTurtlePositionIsZero_ZeroByDefault() {
        turtle.checkCurrentTurtlePosition();
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingEastTest() {
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(0, 1), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingSouth(){
        turtle.turnRight();
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(1, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingWest(){
        turtle.moveForward(5);
        turtle.turnRight();
        turtle.turnRight();
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(0, 3), turtle.checkCurrentTurtlePosition());

    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingWestAtFirstIndex(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }
    @Test
    public void turtleCanMoveForwardWhenFacingNorth(){
        turtle.turnRight();
        turtle.moveForward(5);
        turtle.turnRight();
        turtle.turnRight();
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(3, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingNorthAtFirstIndex(){
        turtle.turnLeft();
        turtle.moveForward(2);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingEastAtLastIndex(){
        turtle.moveForward(6);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingSouthAtLastIndex(){
        turtle.turnRight();
        turtle.moveForward(5);
        assertEquals(new TurtlePosition(4, 0), turtle.checkCurrentTurtlePosition());
    }

//    @Test
//    public void turtleCanWriteWhenPenIsDown(){
//        turtle.putPenDown();
//        assertFalse(turtle.isPenUp());
//        turtle.write(0, 4, 2);
//
//
//        assertEquals("# ", turtle.printSketchPad());
//
//    }

}