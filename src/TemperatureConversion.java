import java.util.*;
class home{
  void  home(){
        System.out.println("1) Celsius to kelvin ");
        System.out.println("2) Celsius to Fahrenheit");
        System.out.println("3) Kelvin to Celsius");
        System.out.println("4) Kelvin to Fahrenheit");
        System.out.println("5) Fahrenheit to Celsius");
        System.out.println("6) Fahrenheit to Kelvin");
        System.out.println("7) EXIT");
    }
}
 public class TemperatureConversion {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         home homepage = new home();
         float constant = 273.15f;
         float constant1= 5/9f;
         float constant2 = 9/5f;

         System.out.println("Wel-Come To Temperature Conversion");
         while (true){
         homepage.home();
         int choice = input.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Enter the Temperature");
                     int celsiusck = input.nextInt();
                     System.out.println("The Temperature is =" + (celsiusck + constant) + "K");
                     break;
                 case 2:
                     System.out.println("Enter the Temperature");
                     int celsiuscf = input.nextInt();
                     float valuecf = celsiuscf * constant2;
                     System.out.println("The Temperature is =" + (valuecf + 32) + "F");
                     break;
                 case 3:
                     System.out.println("Enter the Temperature");
                     int kelvinkc = input.nextInt();
                     System.out.println("The Temperature is =" + (kelvinkc - constant) + "C");
                     break;
                 case 4:
                     System.out.println("Enter the Temperature");
                     int kelvinfc = input.nextInt();
                     float valuekf = (kelvinfc -constant) * constant2;
                     System.out.println("The Temperature is =" + (valuekf+32) + "C");
                     break;
                 case 5:
                     System.out.println("Enter the Temperature");
                     int fehrenheitfc = input.nextInt();
                     float valuefc = (fehrenheitfc - 32);
                     System.out.println("The Temperature is =" + (valuefc * constant1) + "C");
                     break;
                 case 6:
                     System.out.println("Enter the Temperature");
                     int fehrenheitfk = input.nextInt();
                     float valuefk = fehrenheitfk - 32f;
                     System.out.println("The Temperature is =" + ((valuefk * constant1) +constant) + "C");

                     break;
                 case 7:
                     System.out.println("Thank you for using Temperature Conversion");
                     System.exit(0);


             }
         }
     }


}


