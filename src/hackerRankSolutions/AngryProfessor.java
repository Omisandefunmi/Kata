package hackerRankSolutions;

import java.util.List;
import java.util.stream.IntStream;

public class AngryProfessor {
    public static void main(String[] args) {
        int [] sample = new int []{-1, -2, 0, 0, 1, 2};
        System.out.println(willClassBeCancelled(5, sample));

    }
    public static String willClassBeCancelled(int threshold, int [] arr){
        int numberOfEarlyStudents = ((int) IntStream.of(arr).filter(x -> x >= 0).count());
        if(numberOfEarlyStudents>= threshold){return "NO";}
        return "YES";
    }

//    arraylist parameter
    public static String willClassBeCancelled(int threshold, List<Integer> arrival){
        int numberOfEarlyStudents = ((int) arrival.stream().filter(x -> x <= 0).count());
        if(numberOfEarlyStudents >= threshold){ return "NO";}
        return "YES";
    }
}
