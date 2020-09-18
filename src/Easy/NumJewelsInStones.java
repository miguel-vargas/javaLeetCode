package Easy;

import java.util.HashMap;

public class NumJewelsInStones {
    public static void runNumJewelsInStones() {
        String J = "aA";
        String S = "aAAbbbb";

        int result = numJewelsInStones(J, S);

        System.out.println(result);
    }

    public static int numJewelsInStones(String J, String S) {
        int jewelCount = 0;
        HashMap<Character, Integer> stoneCountMap = new HashMap<>();

        for (char c : S.toCharArray()) {
            if (stoneCountMap.containsKey(c)) {
                stoneCountMap.put(c, stoneCountMap.get(c) + 1);
            }
            else {
                stoneCountMap.put(c, 1);
            }
        }

        for (char c : J.toCharArray()) {
            if (stoneCountMap.containsKey(c)) {
                jewelCount += stoneCountMap.get(c);
            }
        }

        return jewelCount;
    }
}
