import java.util.Scanner;
public class kelvinToFahrenheit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter the temperature");
            int kelvin = input.nextInt();
            double value =(kelvin-273.15)*1.8;
            System.out.println("the temperture is ="+(value+32));
        }
    }
}
