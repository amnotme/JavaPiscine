package com.leopoldo;

public class Main {


    private static final String INVALID = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        String res = INVALID;
        if (minutes < 0 || (seconds < 0 || seconds > 59))
            return (res);
        int hours = (minutes / 60) % 23;
        int mins = (minutes % 60);

        String zero1 = "";
        String zero2 = "";
        String zero3 = "";

        if (hours <= 9)
            zero1 = "0";
        if (mins <= 9)
            zero2 = "0";
        if (seconds <= 9)
            zero3 = "0";

        res = (zero1 + hours + "h " + zero2 + mins + "m " + zero3 + seconds + "s");
        return (res);
    }

    public static String getDurationString(int seconds) {
        String res = INVALID;
        if (seconds < 0)
            return (res);
        return (getDurationString(seconds / 60, seconds % 60));
    }
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }
}
