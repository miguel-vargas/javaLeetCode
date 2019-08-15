import java.util.ArrayList;
import java.util.List;

public class Zigzag {
    public static void runZigzag(){
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String solution = convert(s, numRows);

        System.out.println(solution);
    }

    private static String convert(String s, int numRows) {
        // Base Case
        if (numRows == 1){
            return s;
        }

        int minRows = Math.min(numRows, s.length());

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < minRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row: rows) {
            ret.append(row);
        }

        return ret.toString();
    }
}
