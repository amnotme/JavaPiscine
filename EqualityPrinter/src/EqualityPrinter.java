public class EqualityPrinter {

    private static final String INVALID = "Invalid Value";
    private static final String EQUAL = "All numbers are equal";
    private static final String DIFFERENT = "All numbers are different";
    private static final String NEITHER = "Neither all are equal or different";

    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0)
            System.out.println(INVALID);
        else if (n1 == n2 && n2 == n3)
            System.out.println(EQUAL);
        else if (n1 == n2 || n2 == n3 || n1 == n3)
            System.out.println(NEITHER);
        else
            System.out.println(DIFFERENT);
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
}
