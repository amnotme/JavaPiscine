import java.io.*;

public class FunnyEncoded {

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        String output = "";
        String in = "";
        String loc = "";
        int pos = 0;
        int len = 0;
        int first = 0;
        int second = 1;
        int counter = 0;

        s += "(^_^)    ";
        s += "(-_-)    ";
        s += "(>_<)    ";
        s += "(o_o)    ";
        s += "(O_o)    ";
        s += "(^v^)    ";
        s += "(^o^)    ";
        s += "(^_____^)";
        s += "(@_@)    ";
        s += "( *__* ) ";

        System.out.println("Enter a sequence of numbers from 0 to 9 in any order: ");
        in = stdin.readLine();
        len = in.length();

        while (counter < len) {
            pos = 9 * Integer.parseInt(in.substring(first++, second++));
            output += s.substring(pos, pos + 9).trim();
            counter++;
        }
        System.out.println("this is your message");
        System.out.println(output);

    }
}
