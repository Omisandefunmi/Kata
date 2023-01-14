package dsa;

public class StringRotation {
    public static String rotateString(String word, int number){
        String result = word;
        for (int i = 0; i < number; i++) {
             result = result.charAt(result.length() - 1) + result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("inkling", 3));
    }

}
