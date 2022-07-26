package chapterfourteen;

public class Strings {
    public static void main(String[] args) {
        char[] charArray = {'H', 'a', 'p', 'p', 'y', ' ', 'B', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String greet = "Hello";

        String string = new String(greet);
        String string2 = new String(charArray);
        String string3 = new String(charArray, 12, 3);

        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);

        System.out.printf("%s has %d letters %n", greet, greet.length());
        for (int i = 0; i < greet.length() ; i++) {
            System.out.printf("%c ", greet.charAt(i));
        }


    }
}
