package chapter3;

import java.util.Arrays;

public class Coder {
    public static int[] swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swap(2, 3)));
    }
}
