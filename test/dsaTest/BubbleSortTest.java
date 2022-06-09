package dsaTest;

import dsa.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BubbleSortTest {
    @Test
    public void testThatBubbleSortExist(){
        BubbleSort bubbleSort = new BubbleSort();
        assertNotNull(bubbleSort);
    }

    @Test
    public void testThatBubbleSortCanBubbleSortArrays(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] unsorted = new int [] {27, 8, 40, 31, -66, -9, 77, 4};
        int[] result = bubbleSort.bubbleSortArray();
        int [] sorted = {-66, -9, 4, 8, 27, 31, 40, 77};
        assertArrayEquals(sorted, unsorted);
    }
}
