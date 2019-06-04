import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miguel on 5/15/2019.
 */
public class TwoSum {
    public  static void runTwoSum() {
        int[] numbers = new int[] {2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);

        System.out.println(Arrays.toString(result));
    }
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementaryValue = target - nums[i];
            if (valueToIndexMap.containsKey(complementaryValue)) {
                return new int[]{i, valueToIndexMap.get(complementaryValue)};
            }
            valueToIndexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
