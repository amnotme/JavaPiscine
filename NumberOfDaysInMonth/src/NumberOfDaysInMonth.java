public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 9999 || year < 1)
            return (false);
        if (year % 4 == 0 && year % 100 != 0)
            return (true);
        if (year % 400 == 0)
            return (true);
        return (false);
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 12 || month < 1) || (year > 9999 || year < 1))
            return (-1);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return (31);
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return (30);
        if (month == 2 && isLeapYear(year))
            return (29);
        return (28);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
