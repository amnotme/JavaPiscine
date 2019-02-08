public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        double CONVERSION = (1.0 / 1.609);
        long res = Math.round(CONVERSION * kilometersPerHour);
        return (res < 0 ? -1 : res);
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + (toMilesPerHour(kilometersPerHour)) + " mi/h");
        }
    }
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
