package chapter3;

public class Practice {
    public static void main(String[] args) {
        char letter = 'a';
        System.out.println((int) letter);
        double growthRate = 0.01;
        int currentPopulation = 100;
        double populationAfterOneYear = currentPopulation + (currentPopulation * growthRate);
        double populationAfterTwoYears = populationAfterOneYear + (populationAfterOneYear * growthRate);
    }
}
