public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int i = 1;
        int sum = 0;

        if (number < 1)
            return (false);
        while (i != number) {
            if (number % i == 0)
                sum += i;
            i++;
        }
        return (number == sum);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
    }
}
