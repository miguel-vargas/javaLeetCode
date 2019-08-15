import java.util.List;

public class Atoi {
    public static void runAtoi() {
        int ans = myAtoi("4193 with words");

        System.out.println(ans);
    }

    private static int myAtoi(String str) {
        str = str.trim();

        // Base Case
        if (str.isEmpty()) {
            return 0;
        }

        int start = 0, neg = 1;

        if (str.charAt(0) == '-' || str.charAt(0) == '+'){
            start = 1;
            neg = str.charAt(0) == '-'? -1 : 1;
        }

        if (start >= str.length() || !charIsNumber(str.charAt(start))) {
            return 0;
        }

        int res = 0, i = start;

        while (i < str.length() && charIsNumber(str.charAt(i))) {
            // Subtract ASCII value of 0 from characters ASCII value to get integer value
            int digit = str.charAt(i++)-'0';

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE/10 && digit > 7)) {
                return neg == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            }
            res = res * 10 + digit;
        }

        return res * neg;
    }

    private static boolean charIsNumber(char c) {
        return c <= '9' && c >= '0';
    }
}
