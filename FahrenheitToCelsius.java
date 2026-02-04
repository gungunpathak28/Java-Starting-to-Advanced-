import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " °F = " + celsius + " °C");

        sc.close();
    }
}
