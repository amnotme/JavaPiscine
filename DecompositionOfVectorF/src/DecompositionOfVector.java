import java.io.*;

public class DecompositionOfVector {
    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int theta;
        int f;
        double thetaRad;
        double fx;
        double fy;

        System.out.println("Please enter Force : ");
        f = Integer.parseInt(stdin.readLine());
        System.out.println("Please enter Theta: ");
        theta = Integer.parseInt(stdin.readLine());
        thetaRad = theta * (Math.PI / 180);
        fx =  f * Math.cos(thetaRad);
        fy =  f * Math.sin(thetaRad);

        System.out.println("This is fx: " + fx + " and this is fy: " + fy);
    }
}
