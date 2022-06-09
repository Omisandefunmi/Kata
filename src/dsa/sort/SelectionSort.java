package dsa.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = 6; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void swap(int[] array, int largest, int lastUnsortedIndex) {
        if(largest == lastUnsortedIndex){
            return;
        }

        int temp = array[lastUnsortedIndex];

        array[lastUnsortedIndex] = array[largest];
        array[largest] = temp;
    }
}
