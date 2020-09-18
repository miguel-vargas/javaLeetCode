import java.util.HashMap;

public class NumberOfSteps {
    public static void runNumberOfSteps(){
        int num = 123;

        int solution = numberOfSteps(num);

        System.out.println(solution);
    }

    public static int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            num /= 2;
        }
        else {
            --num;
        }

        return 1 + numberOfSteps(num);
    }
}
