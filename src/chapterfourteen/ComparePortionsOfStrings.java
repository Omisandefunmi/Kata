package chapterfourteen;

public class ComparePortionsOfStrings {
    public static void main(String[] args) {
        String e = "Love";
        String f = "lovely";
        System.out.println(compareString(e, f));
    }
    public static boolean compareString(String string1, String string2){
        if(string1.regionMatches(true, 0, string2, 0, string1.length()-1)){
            return true;}
        return false;
    }
}
