package hackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();

        apples.add(-2);
        apples.add(2);
        apples.add(1);

        oranges.add(5);
        oranges.add(-6);

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;

        countAppleAndOranges(s, t, a, b, apples, oranges);
        countAppleAndOrange(s, t, a, b, apples, oranges);
    }
    public static void countAppleAndOrange(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int countApples = 0;
        int countOranges = 0;
        for (Integer apple : apples) {
            int appleFallArea = a + apple;
            if (appleFallArea >= s && appleFallArea <= t) {
                countApples++;
            }
        }

        for (Integer orange : oranges) {
            int orangeFallArea = b + orange;
            if (orangeFallArea >= s && orangeFallArea <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }

    public static void countAppleAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int countApples = ((int) apples.stream().map(x -> x + a).toList().stream().filter(x -> x >= s && x <= t).count());
        int countOranges = ((int) oranges.stream().map(x -> x + b).toList().stream().filter(x -> x >= s && x <= t).count());

        System.out.println(countApples);
        System.out.println(countOranges);
    }
}
