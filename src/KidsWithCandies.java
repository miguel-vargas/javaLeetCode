import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void runKidsWithCandies(){
        int[] candies = new int[]{ 2,3,5,1,3 };
        int extraCandies = 3;

        List<Boolean> solution = kidsWithCandies(candies, extraCandies);

        System.out.println(solution.toString());
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>(candies.length);

        for (int candy : candies) {
            if (candy > max){
                max = candy;
            }
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
