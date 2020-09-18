import java.util.HashMap;

public class NumIdenticalPairs {
    public static void runNumIdenticalPairs(){
        int[] nums = new int[]{ 1,2,3,1,1,3 };

        int solution = numIdenticalPairs(nums);

        System.out.println(solution);
    }

    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                int currentValue = map.get(num);
                result += currentValue;
                map.put(num, ++currentValue);
            }
            else {
                map.put(num, 1);
            }
        }
        return result;
    }
}
