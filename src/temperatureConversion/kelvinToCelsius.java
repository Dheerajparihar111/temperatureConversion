package temperatureConversion;

import java.util.Scanner;
public class kelvinToCelsius {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter the temperature");
            int kelvin =input.nextInt();
            float valuekc = 273.15f;
            System.out.println("the temperature is = "+(kelvin-valuekc)+"c");//conversion kelvin -(273.15)=celsius

        }

    }
}
