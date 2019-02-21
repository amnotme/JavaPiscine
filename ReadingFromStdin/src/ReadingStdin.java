
import java.io.*;

public class ReadingStdin {

    public static void main(String[] args) {


        String firstname = null;
        String lastname = null;

        BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first name");
        try {
          firstname = stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter your last name");
        try {
           lastname = stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Your first name is " + firstname +  " and your last name is " + lastname);

    }

}