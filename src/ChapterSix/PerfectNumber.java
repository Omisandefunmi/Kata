package ChapterSix;

public class PerfectNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            checkIfPerfectNumber(i);
        }

    }

    public static void checkIfPerfectNumber(int number){
        int count = 1;
        int sum = 0;
        while (count < number){
            if (number % count == 0){
                sum += count;

            }
            count++;
        }
        if(sum == number){
            System.out.println(number+" is a perfect number");
        }
    }
}
