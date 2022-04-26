package ChapterSix;

import java.util.Scanner;

public class BeautifyingStrings {

    //collect string from user
    //loop through string
    //check if last character is "."
    //if false, add "." to the string.
    // capitalize the first letter of the string.

    public static void main(String[] args) {

        checkIfFullStop();

    }




    public static void checkIfFullStop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any phrase or sentence");
        String theString = scanner.nextLine();
        char firstIndex = theString.toUpperCase().charAt(0);

        System.out.print(firstIndex);
        for (int i = 1; i < theString.length(); i++) {
            System.out.print(theString.charAt(i));
        }

        if(theString.charAt(theString.length() - 1) != '.') {
            System.out.print(".");
        }
        System.out.println();

    }
}
