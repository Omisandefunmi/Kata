package turtleAgain;

public class Pen {
    private PenPosition penPosition;
    public void isDown() {
        penPosition = PenPosition.DOWN;

    }

    public void isUp() {
        penPosition = PenPosition.UP;
    }
}
