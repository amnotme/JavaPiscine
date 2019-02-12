package com.leopoldo;

public class Main {

    public static int sumDigits(int number) {
        int total = 0;

        if (number < 10)
            return (-1);
        while (number > 9) {
            total += number % 10;
            number /= 10;
        }
        return (total += number);
    }
    public static void main(String[] args) {

        System.out.println(sumDigits(10));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(12345));

    }
}
