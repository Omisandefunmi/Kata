package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        IntStream originalStream = IntStream.rangeClosed(1, 20);
        int sum = originalStream.filter(x -> x%2 == 0).sum();
        System.out.println(sum);

        SecureRandom secureRandom = new SecureRandom();
        String result = secureRandom.ints(10, 1, 7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-"));
        System.out.println(result);
    }
}
