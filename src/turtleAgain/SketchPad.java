package turtleAgain;

public class SketchPad {
//    private int row;
//    private int column;
    private int [][] floor;

    public SketchPad(int row, int column) {
        floor = new int[row][column];
    }

    public int[][] getFloor() {
        return floor;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (var row : floor) {
           for( var column : row){
               if (column == 0){ stringBuilder.append("  ");}
               if (column == 1){ stringBuilder.append("* ");}
           }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
//    public int getRow() {
//        return row;
//    }
//
//    public int getColumn() {
//        return column;
//    }
//
//    public void setRow(int row) {
//        this.row = row;
//    }
//
//    public void setColumn(int column) {
//        this.column = column;
//    }

}
