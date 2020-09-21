package Medium;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public static void run() {
        Permute runner = new Permute();

        List<List<Integer>> answer = runner.permute(new int[]{1,2,3});

        System.out.println(answer);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> listNums = new ArrayList<>();

        for (int num : nums) {
            listNums.add(num);
        }

        int size = nums.length;

        helper(answer, listNums, new ArrayList<>(), size);

        return answer;
    }

    private void helper(List<List<Integer>> answer, List<Integer> listNums, List<Integer> currentList, int size) {
        if (currentList.size() == size) {
            answer.add(currentList);
        }
        else {
            for (int i = 0; i < listNums.size(); i++) {
                List<Integer> newNums = new ArrayList<>(listNums);
                List<Integer> newPermute = new ArrayList<>(currentList);

                newNums.remove(i);
                newPermute.add(listNums.get(i));

                helper(answer, newNums, newPermute, size);
            }
        }
    }
}
