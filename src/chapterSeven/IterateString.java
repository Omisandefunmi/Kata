package chapterSeven;

public class IterateString {
    public static void main(String[] args) {
        iterateStrings("calculate price");
    }

    public static void iterateStrings(String sentence){
        String oneWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            System.out.print(sentence.charAt(i));
             oneWord = sentence.charAt(i)+"";
            if(sentence.charAt(i) == ' ')
                break;


        }


    }
}
