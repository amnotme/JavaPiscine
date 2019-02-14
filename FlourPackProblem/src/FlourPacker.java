public class FlourPacker {

    public static final int BIG = 5;
    public static final int SMALL = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = 0;
        int temp = 0;

        if (bigCount < 0 || smallCount < 0)
            return (false);

        while (bigCount > 0) {
            if (sum == goal)
                return (true);
            if (sum + BIG > goal)
                break;
            sum += BIG;
            bigCount--;
        }

        while (smallCount > 0) {
            if (sum == goal)
                return (true);
            if (sum + SMALL > goal)
                break;
            sum += SMALL;
            smallCount--;
        }
        return (false);
    }

    public static void main(String[] args) {

        System.out.println(canPack(1, 0 ,4));
        System.out.printlnZ(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

}