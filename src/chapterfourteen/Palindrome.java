package chapterfourteen;

public class Palindrome {
    public static void main(String[] args) {
        String w = "madam";
        String v = "daddy";
        System.out.println(isPalindrome(w));
        System.out.println(isPalindrome(v));
    }
    public static boolean isPalindrome(String word){
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        return reverse.toString().equals(word);
    }

}
