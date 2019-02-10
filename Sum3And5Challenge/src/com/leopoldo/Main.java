package com.leopoldo;

public class Main {

    public static void sum() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter += 1;
                System.out.println(i);
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
	    sum();
    }
}
