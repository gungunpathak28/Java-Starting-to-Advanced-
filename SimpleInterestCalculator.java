import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal of the si: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the time of the si: ");
        double time = sc.nextDouble();
        
        System.out.print("Enter the rate of the si: ");
        double rate = sc.nextDouble();

        double SI = (principal*time*rate)/100;
        System.out.println("simple interest is  = " + SI);

        sc.close();
    }
}

