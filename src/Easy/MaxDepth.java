package Easy;

import Utility.TreeNode;

public class MaxDepth {

    public static void run() {
        MaxDepth runner = new MaxDepth();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));

        int depth = runner.maxDepth(root);

        System.out.println(depth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
