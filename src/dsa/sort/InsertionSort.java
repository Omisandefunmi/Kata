package dsa.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = 1; lastUnsortedIndex < array.length; lastUnsortedIndex++) {
            int temp = array[lastUnsortedIndex];
            int i;
            for (i = lastUnsortedIndex; i > 0 && array[i - 1] > temp; i--) {
                array[i] = array[i - 1];
            }
            array[i] = temp;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
