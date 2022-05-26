package turtleAgain;

public class SketchPad {
    private int row;



    private int column;
    private String [][] sketchPad;

    public SketchPad(int row, int column) {
        sketchPad = new String[this.row = row][this.column = column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

}
