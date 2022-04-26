package graceClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumArrayElement {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            sum += myArray[i];
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of myArray is " + sum);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int numberOfRow = input.nextInt();
        System.out.println("Enter number of column");
        int numberOfColumn = input.nextInt();
        int[][] array = new int[numberOfRow][numberOfColumn];
        Random random = new Random();
        int sumOfColumn = 0;

        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                array[i][j] = random.nextInt(7);
                sumOfColumn += array[i][j];
            }

        }

        System.out.println(Arrays.deepToString(array));
        System.out.println("The sum of array is "+sumOfColumn);

    }
}
