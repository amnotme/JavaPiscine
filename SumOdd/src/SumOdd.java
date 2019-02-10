public class SumOdd {

    public static boolean isOdd(int number) {
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start < 0 || end < 0 || end < start)
            return (-1);

        if (isOdd(start))
            ;
        else
            start++;

        for (; start <= end; start += 2) {
            sum += start;
        }
        return (sum);
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}
