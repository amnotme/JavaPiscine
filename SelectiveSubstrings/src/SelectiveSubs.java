import java.io.*;


public class SelectiveSubs {
    public static void main(String[] args) throws IOException {

        String input;
        int first, last;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a new string");
        input = stdin.readLine();
        System.out.println("Enter the beginning of a string");
        first = Integer.parseInt(stdin.readLine());
        System.out.println("Enter the end of the string");
        last = Integer.parseInt(stdin.readLine());
        System.out.println("This is the substring you created: " +
                input.substring(first, last));
        System.out.println("And there you go");
    }
}
