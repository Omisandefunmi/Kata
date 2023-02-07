package chapter3;

public class CountSplits {
    public static int countWaysToSplit(String s) {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        int uniqueCharCount = 0;
        for (int count : charCount) {
            if (count > 0) uniqueCharCount++;
        }
        if (uniqueCharCount % 2 != 0) return 0;
        int result = 1;
        for (int i = 0; i < s.length() / 2 - 1; i++) {
            result *= 2;
        }
        return result;
    }



    public static void main(String[] args) {
        String s = "bbbb";
        System.out.println(countWaysToSplit(s));
    }


}
