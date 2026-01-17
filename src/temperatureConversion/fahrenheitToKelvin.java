package temperatureConversion;

import java .util.Scanner;
public class fahrenheitToKelvin {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i =0;i<5;i++){
            System.out.println("Enter the temperature");
            int fehrenheit = input.nextInt();
            float value = (fehrenheit-32)*5/9;
            System.out.println("the temperature is ="+(value+273.15)+"k");
        }
    }
}
