package chapterfourteen;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String sample = "wwsadertwwod";

        System.out.println(longestSubString(sample));
        String s = "surname";
        String c = "name";
        String d = "Name";
        System.out.println(c.regionMatches(0, s, 3, 4));
        System.out.println(c.regionMatches(false,0, s, 3, 4));
        System.out.println(c.regionMatches(false,0, d, 0, 4));
    }

    public static int longestSubString(String s){
        HashSet<Character> temp = new HashSet<>();
        int highestCount = 0;
        int tempCount = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(temp.contains(s.charAt(j))){
                    tempCount = 0;
                    temp.clear();
                    break;
                }
                else{
                    tempCount++;
                    highestCount = Math.max(tempCount, highestCount);
                }
                temp.add(s.charAt(j));
            }
        }
        return  highestCount;
    }



}
