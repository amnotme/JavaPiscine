public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        boolean wake = false;

        if (barking == true && ((hourOfTheDay < 8  && hourOfTheDay >= 0)
                || (hourOfTheDay <= 24 && hourOfTheDay >= 23))) {
            wake = true;
        }
        return (wake);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

}
