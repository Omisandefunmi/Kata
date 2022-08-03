package hackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> sample = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();

        sample.add(array1);
        sample.add(array2);
        sample.add(array3);

        array1.add(1);
        array1.add(2);
        array1.add(3);

        array2.add(4);
        array2.add(5);
        array2.add(6);

        array3.add(9);
        array3.add(8);
        array3.add(9);

        System.out.println(diagonalDifference(sample));


    }
    public static int diagonalDifference(List<List<Integer>> ar){
        int sumRightToLeft = 0;
        int sumLeftToRight = 0;

        for (int i = 0; i < ar.size(); i++) {
            sumLeftToRight += ar.get(i).get(i);
            sumRightToLeft += ar.get(i).get(ar.size() - (i+1));
        }
        return  Math.abs(sumLeftToRight - sumRightToLeft);
    }
}
