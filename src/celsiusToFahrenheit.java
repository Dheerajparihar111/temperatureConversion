import java.util.Scanner;

public class celsiusToFahrenheit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i =0;i<5;i++) {
            System.out.println("Enter the temperature");
            int celsius = input.nextInt();
            float value = celsius*1.8f;
            System.out.println("ferenheint=" + (value+32));
        }
    }
}
