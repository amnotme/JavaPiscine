public class NumberToWords {

    public static final String INVALID = "Invalid Value";

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0)
            return (-1);
        if (number == 0)
            return (1);
        while(number > 0) {
            number /= 10;
            count++;
        }
        return (count);
    }

    public static int reverse(int number) {
        int newNum = 0;
        int flag = (number < 0 ? -1 : 1);

        if (flag == -1)
            number *= -1;
        while (number > 0) {
            newNum *= 10;
            newNum += number % 10;
            number /= 10;
        }
        return (newNum * flag);
    }

    public static void numberToWords(int number) {


        if (number < 0)
            System.out.println(INVALID);
        int len = getDigitCount(number);
        int rev = reverse(number);
        int revLen = getDigitCount(rev);
        int rem = 0;

        if (number == 0) {
            System.out.println("Zero");
        }


        while (rev > 0) {
            rem = rev % 10;
            rev /= 10;

            switch (rem) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println(INVALID);
            }
        }

        while ((len - revLen) != 0) {
            System.out.println("Zero");
            revLen++;
        }
    }

    public static void main(String[] args) {
        numberToWords(1000);
    }
}
