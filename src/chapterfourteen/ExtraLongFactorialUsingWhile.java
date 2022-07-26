package chapterfourteen;

import java.math.BigInteger;

public class ExtraLongFactorialUsingWhile {
    public static BigInteger findFactorial(int number){
        BigInteger num = BigInteger.valueOf(number);
        BigInteger result = BigInteger.ONE;
        while (!num.equals(BigInteger.ONE)){
            result = result.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findFactorial(5));
    }
}
