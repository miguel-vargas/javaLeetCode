import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void runTwoSum(){
        int[] numbers = new int[]{ 2, 7, 11, 15 };
        int target = 9;

        int[] solution = twoSum(numbers, target);

        System.out.println(Arrays.toString(solution));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            int complementaryValue = target - nums[i];
            if(valueToIndexMap.containsKey(complementaryValue)){
                return new int[]{ valueToIndexMap.get(complementaryValue), i};
            }

            valueToIndexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum possible");
    }
}
