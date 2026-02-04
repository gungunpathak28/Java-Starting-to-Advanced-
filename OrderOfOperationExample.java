public class OrderOfOperationExample {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("Result 1 (10 + 5 * 2) = " + result1);
        int result2 = (10 + 5) * 2;
        System.out.println("Result 2 ((10 + 5) * 2) = " + result2);
        int result3 = 20 / 4 % 3;
        System.out.println("Result 3 (20 / 4 % 3) = " + result3);
        int result4 = 8 + 6 * 2 - 4 / 2;
        System.out.println("Result 4 (8 + 6 * 2 - 4 / 2) = " + result4);
        int a = 5;
        int b = 10;
        int result5 = a + b * 2;
        System.out.println("Result 5 (a + b * 2) = " + result5);
        int x = 10;
        int y = 5;
        int result6 = x + y * x / y;
        System.out.println("Result 6 (x + y * x / y) = " + result6);
    }
}
