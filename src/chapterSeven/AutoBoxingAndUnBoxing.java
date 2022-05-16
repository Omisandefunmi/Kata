package chapterSeven;

import java.util.ArrayList;

public class AutoBoxingAndUnBoxing {
    static class IntValues{
        private int myValue;

        IntValues(int myValue) {
            this.myValue = myValue;
        }
        public int getMyValue() {
            return myValue;
        }
        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }
    public static void main(String[] args) {
       ArrayList<IntValues> numbers = new ArrayList<>();
       numbers.add(new IntValues(4));

//  USING THE JAVA AUTOBOXING IN-BUILT METHOD
//  WE CAN HAVE THE ABOVE CODE WRITTEN OTHERWISE AS:
        ArrayList <Integer> myNum= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myNum.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
           System.out.println("Element "+i+ " --> "+myNum.get(i).intValue() );   //unboxing, though unnecessary
        }
    }
}
