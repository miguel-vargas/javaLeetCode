public class ReverseInterger {
    public static void runReverseInteger(){
        int input = -123;

        int solution = reverse(input);

        System.out.println(solution);
    }

    private static int reverse(int x) {
        int reversedNum = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversedNum > Integer.MAX_VALUE/10 || (reversedNum == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversedNum < Integer.MIN_VALUE/10 || (reversedNum == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversedNum = (reversedNum * 10) + pop;
        }

        return reversedNum;
    }
}
