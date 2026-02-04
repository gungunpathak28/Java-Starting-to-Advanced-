import java.util.Scanner;
public class UnaryOperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Original value: " + x);

        System.out.println("Pre-Increment (++x): " + (++x));
        System.out.println("After Pre-Increment: " + x);

        System.out.println("Post-Increment (x++): " + (x++));
        System.out.println("After Post-Increment: " + x);

        System.out.println("Pre-Decrement (--x): " + (--x));
        System.out.println("After Pre-Decrement: " + x);

        System.out.println("Post-Decrement (x--): " + (x--));
        System.out.println("After Post-Decrement: " + x);

        sc.close();
    }
}
