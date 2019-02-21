import java.util.Scanner;

public class ScannerD {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String f;
       String l;

       System.out.println("Please provide your first and last name: ");
       f = sc.next();
       l = sc.next();

       System.out.println("This is what you wrote: " + f + " " + l);
    }
}
