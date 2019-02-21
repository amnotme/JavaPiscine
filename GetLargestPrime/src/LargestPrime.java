public class LargestPrime {

    public static boolean isPrime(int number) {
        int max = number / 2;
        int iter = 2;
        while (iter < max  + 1) {
            if (max % iter == 0)
                return (false);
            iter++;
        }
        return (true);
    }

    public static int getLargestPrime(int number) {
        int largestFactor = 1;
        int iter = 2;
        if (number < 2)
            return (-1);

        while (iter < number) {
            if (isPrime(iter)) {
                largestFactor *= iter;
                number /= iter;
            } else {
                iter++;
            }
        }
        return (largestFactor);

    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}


