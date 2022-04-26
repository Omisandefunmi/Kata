package chapterTwo;

import java.util.Scanner;

public class WorldPopulationCalculator{

    public static void main(String[] args) {

        calculatePopulationGrowth();
    }





    static final double growthRate = 0.01;
    public static void calculatePopulationGrowth(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years do you wish to calculate?");
        int numberOfYears = scanner.nextInt();
        System.out.println("Enter current world population: ");
        double currentPopulation = scanner.nextDouble();
        double populationSum = 0;
        for (int i = 1; i <= numberOfYears; i++) {
            double populationGrowth = (growthRate * currentPopulation) + currentPopulation;

            System.out.println("The population growth rate for year "+i+ " is "+populationGrowth);
            populationSum += populationGrowth;
            currentPopulation = populationSum;

        }

    }



}
