import java.io.*;


public class ShowBi {

    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String readStr;
        int i;

        System.out.println("Enter an input");

        readStr = stdin.readLine();
        i = Integer.parseInt(readStr);
        System.out.println("Binary-> " + Integer.toBinaryString(i));

    }
}
