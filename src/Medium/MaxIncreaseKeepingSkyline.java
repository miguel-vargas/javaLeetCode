package Medium;

public class MaxIncreaseKeepingSkyline {
    public static void runMaxIncreaseKeepingSkyline() {
        int[][] input = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};

        int result = maxIncreaseKeepingSkyline(input);

        System.out.println(result);
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxIncrease = 0;
        int[] maxRow = new int[grid.length];
        int[] maxColumn = new int[grid.length];

        int maxRowNum;
        int maxColumnNum;

        for (int i = 0; i < grid.length; i++) {
            maxRowNum = grid[i][0];
            maxColumnNum = grid[0][i];

            for (int j = 0; j < grid[i].length; j++) {
                maxRowNum = Math.max(maxRowNum, grid[i][j]);
                maxColumnNum = Math.max(maxColumnNum, grid[j][i]);
            }

            maxRow[i] = maxRowNum;
            maxColumn[i] = maxColumnNum;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int maxHeight = Math.min(maxRow[i], maxColumn[j]);
                int diff = maxHeight - grid[i][j];

                if (diff > 0) {
                    maxIncrease += diff;
                }
            }
        }

        return maxIncrease;
    }
}
