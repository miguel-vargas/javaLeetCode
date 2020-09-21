package Medium;
import Utility.TreeNode;

public class SumEvenGrandparent {
    public static void run() {
        SumEvenGrandparent runner = new SumEvenGrandparent();

        TreeNode root = new TreeNode(6 , new TreeNode(7, new TreeNode(2, new TreeNode(9), null), new TreeNode(7, new TreeNode(1), new TreeNode(4))),new TreeNode(8, new TreeNode(1), new TreeNode(3, null, new TreeNode(5))));

        int result = runner.sumEvenGrandparent(root);

        System.out.println(result);
    }

    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);

        return sum;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        dfs(root.right);

        if (root.val % 2 == 0) {
            if (root.left != null && root.left.left != null) {
                sum += root.left.left.val;
            }

            if (root.left != null && root.left.right != null) {
                sum += root.left.right.val;
            }

            if (root.right != null && root.right.left != null) {
                sum += root.right.left.val;
            }

            if (root.right != null && root.right.right != null) {
                sum += root.right.right.val;
            }
        }
    }
}
