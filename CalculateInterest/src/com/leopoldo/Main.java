package com.leopoldo;

public class Main {

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return (false);
        for (int i = 2; i <= (int) Math.sqrt(n); i++ ) {
            if (n % i == 0)
                return (false);
        }
        return (true);

    }


    public static void main(String[] args) {

        int count = 0;

        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 10; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("This is a prime number: " + i);
                count++;
            }
            if (count == 3)
                break;
        }
    }
}
