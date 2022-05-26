package turtleAgain;

public class TurtlePosition {
    private int row;
    private int column;

    public TurtlePosition(int row, int column) {this.row = row; this.column = column;}

    public int getRow() {return row;}

    public void setRow(int row) {this.row = row;}

    public int getColumn() {return column;}

    public void setColumn(int column) {this.column = column;}

    @Override
    public String toString(){
        return String.format("""
                row = %d
                column = %d""", row, column);
    }

    public boolean equals(Object o){
        if(getClass() != this.getClass()) return false;
        TurtlePosition compared = (TurtlePosition) o;
        return this.row == compared.row && this.column == compared.column;
    }
}
