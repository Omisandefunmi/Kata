package dsa;

public class Fibonacci {
    public static void main(String[] args){

        System.out.println(fibonacci(5));
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
    }

    public static String fibonacci(int number){
        int a = 0;
        int b = 1;
        StringBuilder result = new StringBuilder();
        result.append(a).append(" ").append(b);
        int sum;
        if (number < 1 ){
            return ""+a;
        }
        if (number == 1 ){
            return result.toString();
        }
        for (int i = 1; i <= number; i++) {
            sum = a + b;
            result.append(" ").append(sum);
            a = b;
            b = sum;
        }
        return result.toString();
    }
}
