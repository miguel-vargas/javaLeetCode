public class PalindromeNumber {
    public static void runPalindromeNumber(){
        int input = 0;

        boolean solution = isPalindrome(input);

        System.out.println(solution);
    }

    private static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        if (x < 0) {
            return false;
        }

        int originalNum = x;

        int reversedNum = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
//            if (reversedNum > Integer.MAX_VALUE/10 || (reversedNum == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (reversedNum < Integer.MIN_VALUE/10 || (reversedNum == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversedNum = (reversedNum * 10) + pop;
        }

        return reversedNum == originalNum;
    }
}
