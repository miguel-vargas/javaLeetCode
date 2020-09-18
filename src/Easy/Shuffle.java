package Easy;

import java.util.Arrays;

public class Shuffle {
    public static void runShuffle(){
        int[] numbers = new int[]{ 2,5,1,3,4,7 };
        int n = 3;

        int[] solution = shuffle(numbers, n);

        System.out.println(Arrays.toString(solution));
    }

    public static int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];

        for (int i = 0, j = 0; i < n; i++, j+=2) {
            result[j] = nums[i];
            result[j+1] = nums[i+n];
        }

        return result;
    }
}
