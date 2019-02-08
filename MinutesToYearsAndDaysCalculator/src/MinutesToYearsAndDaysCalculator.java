public class MinutesToYearsAndDaysCalculator {

    private static final String INVALID = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println(INVALID);
        else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            System.out.println(minutes + " min = " + years + " y and "
                    + days % 365 + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

}
