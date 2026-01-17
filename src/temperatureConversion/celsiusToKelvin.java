package temperatureConversion;

import java.util.Scanner;
public class celsiusToKelvin extends kelvinToCelsius {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the temperature");
            int celsius = input.nextInt();
            float value = 273.15f;
            float kelvin = celsius + value;
            System.out.println(kelvin);
        }
    }
}
