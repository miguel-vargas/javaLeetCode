import java.util.HashSet;
import java.util.Set;

public class LongestSubWORepChars {
    public static void runLongest() {
        int ans = lengthOfLongestSubstring("pwwkew");

        System.out.println(ans);
    }

    // RUNTIME: O(n)
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }

        System.out.println(ans);
        return ans;
    }
}
