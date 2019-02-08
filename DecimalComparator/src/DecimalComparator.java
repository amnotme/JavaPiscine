public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (Math.abs(num1 - num2) <= 0.0009d ? true : false);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
