package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupThePeople {
    public static void runGroupThePeople() {
        int[] groupSizes = new int[]{ 3,3,3,3,3,1,3 };

        List<List<Integer>> solution = groupThePeople(groupSizes);

        System.out.println(solution.toString());
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groupList = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> group = new ArrayList<>();
            if (map.containsKey(groupSizes[i])) {
                group = map.get(groupSizes[i]);
            }
            group.add(i);
            map.put(groupSizes[i], group);
            if (group.size() == groupSizes[i]) {
                groupList.add(group);
                map.remove(groupSizes[i]);
            }
        }
        return groupList;
    }
}
