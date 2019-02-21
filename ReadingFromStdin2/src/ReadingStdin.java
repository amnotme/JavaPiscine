
import java.io.*;

public class ReadingStdin {

    public static void main(String[] args) throws IOException {

        String first = null;
        String last = null;
        String choice = null;

        int firstN = 0;
        int lastN = 0;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write something to this variable");
        first = stdin.readLine();
        System.out.println("Now write something else to this variable");
        last = stdin.readLine();
        System.out.println("Perfect now you have " + first +" and then you have " + last);

        System.out.println("Would you like to try to change these into integers" );
        choice = stdin.readLine();

        if (choice.toLowerCase().equals("yes") || choice.toLowerCase().equals("y")) {
            firstN = Integer.parseInt(first);
            lastN = Integer.parseInt(last);
            System.out.println("Here's what you asked for : " + firstN + " and then " + lastN);
        } else {
            System.out.println("Well you chose not to convert anything.");
        }
    }
}
