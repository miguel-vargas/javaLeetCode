import java.util.HashSet;
import java.util.Set;

/**
 * Created by Miguel on 7/19/2019.
 */
public class LongestSubstrNoRepeatChar {
    public static void runLongest() {
        int ans = lengthofLongestSubstring("pwwkew");

        System.out.println(ans);
    }

    public static int lengthofLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();

        int ans = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt((j++)));
                ans = Math.max(ans, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }
}
