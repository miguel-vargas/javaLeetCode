package Easy;

public class ReverseString {

    public static void run() {
        ReverseString runner = new ReverseString();

        char[] stringToReverse = new char[]{'H','e','l','l','o'};

        runner.reverseString(stringToReverse);

        System.out.println(stringToReverse);
    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            --right;
            ++left;
        }
    }
}
