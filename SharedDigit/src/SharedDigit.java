public class SharedDigit {

    public static boolean hasSharedDigit(int n1, int n2) {
     if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99))
         return false;
     int firstLeft = n1 % 10;
     int firstRight = n2 % 10;
     int secondLeft = (n1 /= 10);
     int secondRight = (n2 /= 10);

     if (firstLeft == firstRight || firstLeft == secondRight)
         return true;
     if (secondLeft == secondRight || secondLeft == secondRight)
         return true;
     return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
