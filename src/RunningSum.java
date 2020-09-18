import java.util.Arrays;

public class RunningSum {
    public static void runRunningSum(){
        int[] numbers = new int[]{ 1,2,3,4 };

        int[] solution = runningSum(numbers);

        System.out.println(Arrays.toString(solution));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }
}
