public class TeenNumberChecker {

    public static  boolean isTeen(int age) {
        return (age >= 13 && age <= 19 ? true : false);
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if (isTeen(n1) || isTeen(n2) || isTeen(n3))
            return (true);
        return (false);
    }
    
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
