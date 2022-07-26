package chapterfourteen;

public class StrongPassword {
    public static void main(String[] args) {
        String s = "2bbbb#$";
        int n = 7;
        int result = returnMinimumCharactersToMakeStrongPassword(s, n);
        System.out.println(result);
    }
    public static int returnMinimumCharactersToMakeStrongPassword(String s, int n){
        int result = 0;
        if(!s.matches("[A-Z]")){
            result++;
        }
        if(!s.matches("[a-z]")){
            result++;
        }
        if(!s.matches("\\d")){
            result++;
        }
        if(!s.matches("[^a-zA-z\\d]")){
            result++;
        }
        if(n+result < 6){
            result += 6 -(n + result);
        }
        return result;
    }
}
