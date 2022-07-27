package chapterSeventeen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practicing {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0);
        System.out.println(Arrays.toString(intStream.toArray()));

        int[] numbers = new int []{9, 8, 7, 4, 5, 3, 2, 4, 9, 4 ,0, 10};
        long count = IntStream.of(numbers).filter(x -> x > 4).count();
        System.out.println(count);

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);

        int totalOfTriples = IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum();
        System.out.println(totalOfTriples);

        int totalWithoutFilter = IntStream.rangeClosed(1, 10).map(x -> x * 3 ).sum();
    }
}
