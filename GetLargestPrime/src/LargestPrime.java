public class LargestPrime {


    public static int getLargestPrime(int number) {
        int largestFactor = -1;
        int iter = number;
        int iter2 = 2;
        int temp  = iter;
        int prime = 1;

        if (number < 2)
            return (largestFactor);

        while (iter > 1) {
            prime = 1;
            temp = iter;
            iter2 = 2;
            while (iter2 < temp) {
                if (temp % iter2 == 0)
                    prime = 0;
                iter2++;

            }

            if (prime == 1){
                System.out.println(iter);
                if (number % iter == 0) {
                    largestFactor = iter;
                    return (largestFactor);
                }
                iter--;
            } else {
                iter--;
            }
        }
        return (largestFactor);
    }

    public static void main(String[] args) {


        System.out.println(getLargestPrime(16));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
    }
}


