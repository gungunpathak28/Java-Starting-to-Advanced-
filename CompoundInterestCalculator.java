import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time period (in years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);

        double compoundInterest = amount - principal;
        System.out.println("Total Amount (A) = " + amount);
        System.out.println("Compound Interest (CI) = " + compoundInterest);

        sc.close();
    }
}
