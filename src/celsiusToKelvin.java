
import java.util.Scanner;
public class celsiusToKelvin {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i =0;i<5;i++) {
            System.out.println("enter the tempera ture");
            int celsius = input.nextInt();
            float value = 273.15f;
            float kelvin = celsius + value;
            System.out.println(kelvin);
        }
    }
}
