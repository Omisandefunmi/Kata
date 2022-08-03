package hackerRankSolutions;

import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {
        int [] ar = new int []{1};
        System.out.println(++ar[0]);
    }
    public static long aVeryBigSum(List <Long> ar){
        return ar.stream().reduce(0L, Long::sum);
    }
}
