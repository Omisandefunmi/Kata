package kata;

public class Kata {
    public static boolean fillArrayIndices(boolean[] array, int lengthLimit) {
        for (int i = 0; i < lengthLimit; i++) {
            array[i] = true;
        }
        return true;
    }


    public static String capitalizeFirstLetter(String string) {
       char firstLetter = string.toUpperCase().charAt(0);
        //
//        for (int i = 1; i < string.length(); i++) {
//            beautified+= string.charAt(i);
//
//        }

        return firstLetter+ string.substring(1);

    }

    public static String addFullStop(String string){
        if(string.charAt(string.length()-1) != '.')
            string += ".";
        return string;
    }

    public static String capitalizeStringAddFullStop(String string) {
      String newString = Kata.capitalizeFirstLetter(string);
              newString = Kata.addFullStop(newString);


        return newString;
    }

    public static double convertToKelvin(double celsiusValue) {

        return celsiusValue + 273.15;
    }

    public static double convertToCelsius(double kelvinValue) {
        return kelvinValue - 273.15;
    }
}
