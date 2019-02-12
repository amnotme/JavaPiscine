public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = 0;
        int newNum = 0;
        int counter = 0;

        if (number < 0)
            return (-1);
        if (number < 10)
            return (number + number);

        while (number > 0) {
            if (counter == 0)
                last = number % 10;
            counter++;
            newNum *= 10;
            newNum += number % 10;
            number /= 10;
        }
        first = newNum % 10;
        return (first + last);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));

        System.out.println(sumFirstAndLastDigit(257));

        System.out.println(sumFirstAndLastDigit(0));

        System.out.println(sumFirstAndLastDigit(5));

        System.out.println(sumFirstAndLastDigit(-10));
    }
}
