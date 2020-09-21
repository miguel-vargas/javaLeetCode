package Easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {

    public static void run() {
        SingleNumber runner = new SingleNumber();

        int answer = runner.singleNumber(new int[]{4,1,2,1,2});

        System.out.println(answer);
    }

    public int singleNumber(int[] nums) {
        List<Integer> numList = new ArrayList<>();

        for (int num : nums) {
            if (numList.contains(num)) {
                numList.remove(numList.indexOf(num));
            }
            else {
                numList.add(num);
            }
        }

        return numList.get(0);
    }

//    public int singleNumber(int[] nums) {
//        final int[] answer = {0};
//
//        HashMap<Integer, Integer> map = new HashMap();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                int newValue = map.get(nums[i]) + 1;
//                map.put(nums[i], newValue);
//            }
//            else {
//                map.put(nums[i], 1);
//            }
//        }
//
//        map.forEach((key, value) -> {
//            if (value == 1) {
//                answer[0] = key;
//            }
//        });
//
//        return answer[0];
//    }
}
