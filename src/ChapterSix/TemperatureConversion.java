package ChapterSix;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        convertTemperature();

    }






















    private static final Scanner input = new Scanner(System.in);
    private static String kelvinToCelsius(){
        System.out.println("Enter temperature in Kelvin");
        double temperatureInKelvin = input.nextDouble();

        return temperatureInKelvin+"kelvin is "+(temperatureInKelvin - 273.15)+" in celsius";
    }

    private static String celsiusToKelvin(){
        System.out.println("Enter temperature in Kelvin");
        double temperatureInCelsius = input.nextDouble();

        return temperatureInCelsius+" celsius is "+(temperatureInCelsius + 273.15)+" in Kelvin";
    }

    public static void convertTemperature(){

        String options = """
                WELCOME TO TEMPERATURE CONVERSION APP
                
                PRESS 1 TO CONVERT KELVIN TO CELSIUS
                
                PRESS 2 TO CONVERT CELSIUS TO KELVIN""";
        System.out.println(options);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println(kelvinToCelsius());
                break;
            case 2:
                System.out.println(celsiusToKelvin());
                break;
            default:
                System.out.println("Invalid value");
                convertTemperature();

    }


   }


}
