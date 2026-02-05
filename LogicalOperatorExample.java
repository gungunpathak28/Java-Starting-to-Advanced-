import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have ID? (true/false): ");
        boolean hasID = sc.nextBoolean();

        if (age >= 18 && hasID) {
            System.out.println("You are allowed");
        } else {
            System.out.println("You are not allowed");
        }

        sc.close();
    }
}
