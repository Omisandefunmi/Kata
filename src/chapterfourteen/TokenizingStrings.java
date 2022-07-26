package chapterfourteen;

import java.util.Arrays;
import java.util.Scanner;

public class TokenizingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press enter");
        String sentence = scanner.nextLine();

        System.out.println(Arrays.toString(sentence.split(" ")));
        String [] tokens = sentence.split(" ");
        for (var token:
             tokens
             ) {
            System.out.println(token);
        }


    }
}
