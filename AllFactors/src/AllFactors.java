public class AllFactors {

    public static final String INVALID = "Invalid Value";

    public static void printFactors(int number) {
        int i = 1;

        if (number < 1)
            System.out.println(INVALID);
        else {
            while (i <= number) {
                if (number % i == 0)
                    System.out.println(i);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
