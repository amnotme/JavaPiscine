public class LastDigitChecker {

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3))
            return false;
        int n1Last = n1 % 10;
        int n2Last = n2 % 10;
        int n3Last = n3 % 10;

        if ((n1Last != n2Last && n1Last != n3Last) && (n2Last != n1Last && n2Last != n3Last))
            return false;
        return true;
    }



    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}
