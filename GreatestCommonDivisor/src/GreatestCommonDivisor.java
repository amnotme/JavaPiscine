public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int current = 1;
        int i = 2;

        if (first < 10 || second < 10)
            return (-1);
        while(i != first + 1 && i != second + 1) {
            if (first % i == 0 && second % i == 0) {
                first /= i;
                second /= i;
                current *= i;
                i = 1;
            }
            i++;
        }
        return (current);
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }
}