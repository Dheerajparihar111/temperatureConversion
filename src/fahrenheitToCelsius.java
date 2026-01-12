import java.util.Scanner;
public class fahrenheitToCelsius {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println("Enter the temperature");
            float fahrenheit = input.nextFloat();
            double value = (fahrenheit - 32) * 5 / 9;
            System.out.println(value);
        }
    }
}
