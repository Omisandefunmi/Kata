package hackerRankSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        System.out.println(arraySumLambda(numbers));
        System.out.println(arraySum(numbers));
    }

    public static int arraySum(List <Integer> arr){
        if(arr.size() == 0){return 0;}
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }
    public static int arraySumLambda(List <Integer> arr) {
        return arr.stream()
                .reduce(0, Integer::sum);
    }
}
