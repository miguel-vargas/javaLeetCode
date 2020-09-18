package Medium;

import java.util.Arrays;

public class SubrectangleQueries {
    public static void runSubrectangleQueries() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][]{{1,2,1},{4,3,4},{3,2,1},{1,1,1}});
        subrectangleQueries.getValue(0, 2);
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.getValue(0, 2);
        subrectangleQueries.getValue(3, 1);
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.getValue(3, 1);
        subrectangleQueries.getValue(0, 2);
    }

    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
        this.print();
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int r = row1; r < row2+1; r++) {
            // Arrays.fill(this.rectangle[r],col1, col2+1, newValue);
            for (int c = col1; c < col2+1; c++) {
                this.rectangle[r][c] = newValue;
            }
        }
        this.print();
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }

    public void print() {
        for (int row = 0; row < this.rectangle.length; row++) {
            for (int col = 0; col < this.rectangle[row].length; col++) {
                System.out.print(String.format("%d ", this.rectangle[row][col]));
            }
            System.out.println();
        }
        System.out.println();
    }
}
