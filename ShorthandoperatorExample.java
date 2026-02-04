import java.util.Scanner;
public class ShorthandoperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        int x = sc.nextInt();
        System.out.print("Enter value to use in operations: ");
        int n = sc.nextInt();
        x += n;
        System.out.println("After += : " + x);
        x -= n;
        System.out.println("After -= : " + x);
        x *= n;
        System.out.println("After *= : " + x);
        x /= n;
        System.out.println("After /= : " + x);
        x %= n;
        System.out.println("After %= : " + x);
        sc.close();
    }
}
