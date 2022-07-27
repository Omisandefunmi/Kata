package hackerRankSolutions;

import java.util.Arrays;

public class CompareTriplets {
    public static void main(String[] args) {
        int [] a = new int[]{3, 2, 1};
        int [] b = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(compareTriplets(a, b)));
    }
    public static int[] compareTriplets(int [] a, int [] b){
        if(a.length != b.length){
            return new int []{0};
        }

        int a_score = 0;
        int b_score = 0;
        int [] result = new int [2];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > b[i]){
                a_score ++;
            }
            else if(b[i] > a[i]){
                b_score++;
            }

        }
        result[0] = a_score;
        result[1] = b_score;
        return result;
    }
}
