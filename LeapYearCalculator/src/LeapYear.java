public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leap = false;

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 && year > 0 && year < 10000)
            leap = true;
        else if (year % 4 == 0 && year % 100 != 0 && year > 0 && year < 10000)
            leap = true;
        return (leap);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1924));
    }

}
