public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int newNum = 0;
        int oldNum = 0;
        if (number < 0)
            number *= -1;
        oldNum = number;
        while (number > 0) {
            newNum *= 10;
            newNum += number % 10;
            number /= 10;
        }

        System.out.println("NewNum = " + newNum  +" OldNum = " + oldNum);
        return (newNum == oldNum);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
