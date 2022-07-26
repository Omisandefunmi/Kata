package chapterSeventeen;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DuplicateWordRemoved {
    public static void main(String[] args) {
        System.out.println("enter a sentence");
        String response = new Scanner(System.in).nextLine();
        System.out.println(removeDuplicateWord(response));

    }
    public static List<String> removeDuplicateWord(String sentence){
        String small = sentence.toLowerCase();

        String [] arr = small.split(" ");
        return Stream.of(arr)
                .sorted()
                .distinct().toList();
    }
}
