package turtleAgainTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleAgain.Direction;
import turtleAgain.SketchPad;
import turtleAgain.TurtleAgain;
import turtleAgain.TurtlePosition;


import static org.junit.jupiter.api.Assertions.*;


public class TurtleAgainTest {
    private TurtleAgain turtle;
    private SketchPad sketchPad;

    @BeforeEach
    public void alwaysStartWith() {
        turtle = new TurtleAgain();
        sketchPad = new SketchPad(5, 5);
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
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(0, 1), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingSouth(){
        turtle.turnRight();
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(1, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingWest(){
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(0, 3), turtle.checkCurrentTurtlePosition());

    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingWestAtFirstIndex(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }
    @Test
    public void turtleCanMoveForwardWhenFacingNorth(){
        turtle.turnRight();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(3, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingNorthAtFirstIndex(){
        turtle.turnLeft();
        turtle.move(2,sketchPad);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingEastAtLastIndex(){
        turtle.move(6,sketchPad);
        assertEquals(new TurtlePosition(0, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanNotMoveForwardWhenFacingSouthAtLastIndex(){
        turtle.turnRight();
        turtle.move(5,sketchPad);
        assertEquals(new TurtlePosition(4, 0), turtle.checkCurrentTurtlePosition());
    }

    @Test
    public void turtleCanWriteWhenPenIsDownAndItMovesEast(){
        turtle.putPenDown();
        assertFalse(turtle.isPenUp());
        turtle.move(4,sketchPad);
        String expected = """
                * * * *  \s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected,sketchPad.toString());

    }

    @Test
    public void turtleCanWriteWhenPenIsDownAndItMovesSouth() {
        turtle.putPenDown();
        assertFalse(turtle.isPenUp());
        turtle.turnRight();
        turtle.move(4, sketchPad);
        String expected = """
                *        \s
                *        \s
                *        \s
                *        \s
                         \s
                """;
        assertEquals(expected, sketchPad.toString());
    }

    @Test
    public void turtleCanWriteWhenPenIsDownAndItMovesWest(){
        turtle.move(2, sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(new TurtlePosition(0, 1), turtle.checkCurrentTurtlePosition());
        assertEquals(Direction.WEST, turtle.checkCurrentPenDirection());
        turtle.putPenDown();

        turtle.move(2, sketchPad);
        String expected = """
                * *      \s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected, sketchPad.toString());
    }

    @Test
    public void turtleCanWriteWhenPenIsDownAndItMovesNorth(){
        turtle.move(2, sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(new TurtlePosition(0, 1), turtle.checkCurrentTurtlePosition());
        turtle.turnLeft();
//        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.checkCurrentPenDirection());
        turtle.putPenDown();

        turtle.move(2, sketchPad);
        String expected = """
                * *      \s
                         \s
                         \s
                         \s
                         \s
                """;
//        assertEquals(expected, sketchPad.toString());
    }
}