import java.util.Scanner;
public class FloatingExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		Float a = sc.nextFloat();
		System.out.println("enter b value:");
		Float b = sc.nextFloat();
		Float product = a*b;
		System.out.println("Product of " + a + " and "+ b +"="+product);
		sc.close();
	}

}
