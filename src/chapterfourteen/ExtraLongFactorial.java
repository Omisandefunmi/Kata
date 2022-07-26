package chapterfourteen;

import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void extraLongFactorial(int num){
        System.out.println(findFactorial(num));
    }
    private static BigInteger findFactorial(int number){
        BigInteger result = new BigInteger(String.valueOf(number));
        if (number == 1){
            return result;
        }
        else {
            result = result.multiply(findFactorial(number - 1));
        }
        return result;

    }

    public static void main(String[] args) {
        int number = 5;
        extraLongFactorial(5);
    }
}
