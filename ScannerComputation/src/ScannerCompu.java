import java.util.Scanner;

public class ScannerCompu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Please enter two values for 'a' and 'b' : ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Exponent: " + (Math.pow(a, b)));
        System.out.println("Square root: " + a / (Math.pow(2, b - 1)));
    }
}
