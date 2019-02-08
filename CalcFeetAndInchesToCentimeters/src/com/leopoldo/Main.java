package com.leopoldo;

public class Main {

    public static double toCen(double inches) {
        return (inches * 2.54d);
    }

    public static double toInc(double feet) {
        return (feet * 12.0d);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        int res = 0;

        res = (feet >= 0 && (inches >= 0 && inches <= 12) ? 1 : -1);
        return (res == -1 ? -1 : (toCen(toInc(feet)) + toCen(inches)));
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        int res = 0;

        res = (inches >= 0 ? 1 : -1);
        return (res == -1 ? -1 : calcFeetAndInchesToCentimeters(inches / 12.0, inches % 12));
    }
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(60));
        System.out.println(calcFeetAndInchesToCentimeters(5, 4));
    }
}
