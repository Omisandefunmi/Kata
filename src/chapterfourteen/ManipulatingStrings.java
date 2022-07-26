package chapterfourteen;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word or # to stop");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        while(!string.equals("#")){
            stringBuilder.append(string);
            stringBuilder.append(" ");
            System.out.println("Enter any word or # to stop");
            string = scanner.nextLine();
        }
        System.out.println(stringBuilder.toString());
        String[] tokens = stringBuilder.toString().split(" ");
        System.out.println(Arrays.toString(tokens));
        for (var token: tokens) {
//            token.replace(token.charAt(0),)
            System.out.println(token.replace(token.charAt(0), token.charAt(0)));
        }


    }
}
