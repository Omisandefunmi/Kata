package dsa;

public class Palindrome {
    public static boolean isPalindrome(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString().equals(word);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("maiden"));
    }
}
