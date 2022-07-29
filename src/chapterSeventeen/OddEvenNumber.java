package chapterSeventeen;

import java.security.SecureRandom;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        IntStream stream  = random.ints(10, 0, 1001);
        List<Integer> list = stream.boxed().toList();

        long evenCount = list.stream().filter(x -> x % 2 == 0).count();
        long oddCount = list.stream().filter(x -> x % 2 == 1).count();

        double evenAverage = (list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum) * 1.0) / evenCount;

        double oddAverage =  (list.stream()
                        .filter(x -> x % 2 == 1)
                                .reduce(0, Integer::sum))* 1.0 / oddCount;

        System.out.println(list);
        System.out.println("There are "+evenCount+" even numbers in the stream");
        System.out.println("There are "+oddCount+" even numbers in the stream");
        System.out.println("The average of even numbers in the stream is "+evenAverage);
        System.out.println("The average of odd numbers in the stream is "+oddAverage);

        IntPredicate greaterThanFive = x -> x > 5;

        int[] values = {1, -2, 4, 5,6, 12, -23, 45};
        List <Integer> list1 = IntStream.of(values).filter(greaterThanFive).boxed().toList();
        System.out.println(list1);
    }
}
