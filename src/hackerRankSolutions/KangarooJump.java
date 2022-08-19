package hackerRankSolutions;

public class KangarooJump {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int firstKangarooLocation = x1 + v1;
        int secondKangarooLocation = x2 + v2;
        if(firstKangarooLocation == secondKangarooLocation){return "YES";}
        return "NO";
    }
}

