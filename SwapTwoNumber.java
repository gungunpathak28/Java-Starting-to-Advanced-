import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		int c = a; 
		a = b;
		b = c; 
		System.out.println("Value of a is:" +a);
		System.out.println("Value of a is:" +b);
		System.out.println("Swapping done...");
		

	}

}
