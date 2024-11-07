//Implement a program that converts temperature from Celsius to Fahrenheit and vice versa.
//f = (9/5*c) + 32 and °C = (°F - 32) × 5/9
import java.util.Scanner;
class degreeConv{
    public static void main(String args[]){
        
        System.out.println("Enter the choice of operation: ");
        System.out.println("Enter 1 to calculate celsius");
        System.out.println("Enter 2 to calculate fahrenheit");
        Scanner cha = new Scanner(System.in);
        int ch = cha.nextInt();
        
        if(ch != 0){
            switch(ch){
                case 1:
                    System.out.println("Enter the value of fahrenheit: ");
                    Scanner far = new Scanner(System.in);
                    double fahrenheit = far.nextDouble();
                    if(fahrenheit != 0){
                        double c = celsius(fahrenheit);
                        System.out.println("the fahrenheit to celsius conversion is: "+ c);
                    }
                    break;
                case 2:
                    System.out.println("Enter the value of celsius: ");
                    Scanner cel = new Scanner(System.in);
                    double celsius = cel.nextDouble();
                    if(celsius != 0){
                        double f = fahrenheit(celsius);
                        System.out.println("the celsius to fahrenheit conversion is: "+ f);
                    }
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }

    }

    public static double celsius(double fahrenheit){
        double cel = (fahrenheit-32)*(5/9);
        return cel;
    }

    public static double fahrenheit(double celsius){
        double far = (9/5*celsius)+32;
        return far;
    }
}