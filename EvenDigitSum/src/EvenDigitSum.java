public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int total = 0;

        if (number < 0)
            return (-1);
        while (number > 0) {
            if (number % 2 == 0) {
                total += (number % 10);
            }
            number /= 10;
        }
        return (total);
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
