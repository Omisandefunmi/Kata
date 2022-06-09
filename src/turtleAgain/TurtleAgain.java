package turtleAgain;

public class TurtleAgain {

    private boolean isPenUp = true;
    private Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
    private TurtlePosition turtlePosition = new TurtlePosition(0, 0);



    public boolean isPenUp() {
        return isPenUp;
    }

    public void putPenDown() {
        pen.isDown();
        isPenUp = false;
    }

    public void putPenUp() {
        pen.isUp();
        isPenUp = true;
    }

    public Direction checkCurrentPenDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == Direction.EAST){currentDirection = Direction.SOUTH;}
        else if(currentDirection == Direction.SOUTH){currentDirection = Direction.WEST;}
        else if(currentDirection == Direction.WEST){currentDirection = Direction.NORTH;}
        else {currentDirection = Direction.EAST;}
    }

    public void turnLeft() {
        if(currentDirection == Direction.EAST){currentDirection = Direction.NORTH;}
        else if(currentDirection == Direction.NORTH){currentDirection = Direction.WEST;}
        else if(currentDirection == Direction.WEST){currentDirection = Direction.SOUTH;}
        else{currentDirection = Direction.EAST;}
    }

    public TurtlePosition checkCurrentTurtlePosition() {
        return new TurtlePosition(turtlePosition.getRow(), turtlePosition.getColumn());
    }

    public void move(int steps, SketchPad sketchPad) {
        if(!isPenUp()){
        if(currentDirection == Direction.EAST){writeForwardOnColumnBy(steps, sketchPad);}
        if(currentDirection == Direction.SOUTH){writeDownwardOnRowBy(steps, sketchPad);}
        if(currentDirection == Direction.WEST){writeBackwardOnColumnBy(steps, sketchPad);}
    }

        if(currentDirection == Direction.EAST){increaseColumnBy(steps); }
        else if(currentDirection == Direction.SOUTH){increaseRowBy(steps);}
        else if(currentDirection == Direction.WEST){decreaseColumnBy(steps);}
        else{decreaseRowBy(steps);}
        }

    private void writeBackwardOnColumnBy(int steps, SketchPad sketchPad) {
        int [][] floor = sketchPad.getFloor();
        int row = turtlePosition.getRow();
        int column = turtlePosition.getColumn();
        steps -= column;
        for (int i = column; i < steps; i--) {
            floor[row][i] = 1;
        }
    }

    private void writeDownwardOnRowBy(int steps, SketchPad sketchPad) {
        int [][] floor = sketchPad.getFloor();
        int row = turtlePosition.getRow();
        int column = turtlePosition.getColumn();
        steps += column;

        for (int i = row; i < steps; i++) {
            floor[i][column] = 1;
        }

    }

    private void writeForwardOnColumnBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = turtlePosition.getRow();
        int column = turtlePosition.getColumn();
        steps += column;

        for (int i = column; i < steps; i++) {
            floor[row][i] = 1;
        }

    }

    private void decreaseRowBy(int steps) {
        if(turtlePosition.getRow() != 0){turtlePosition.setRow(turtlePosition.getRow() - (steps - 1));}
    }

    private void decreaseColumnBy(int steps) {
        if(turtlePosition.getColumn() != 0 ){turtlePosition.setColumn(turtlePosition.getColumn() - (steps - 1));}
    }

    private void increaseColumnBy(int steps) {
        if((turtlePosition.getColumn() + (steps-1)) <= 4)turtlePosition.setColumn(turtlePosition.getColumn() + (steps - 1));
    }

    private void increaseRowBy(int steps){
        if((turtlePosition.getRow() + (steps - 1)) <= 4){turtlePosition.setRow(turtlePosition.getRow() + (steps - 1));};
    }

    }



