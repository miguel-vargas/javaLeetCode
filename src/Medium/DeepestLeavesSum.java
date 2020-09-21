package Medium;

import Utility.TreeNode;

public class DeepestLeavesSum {
    public static void run() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));

        DeepestLeavesSum theClass = new DeepestLeavesSum();

        int result = theClass.deepestLeavesSum(root);

        System.out.println(result);
    }

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int treeHeight = getTreeHeight(root);

        return getSum(root, treeHeight, 1);
    }

    private int getSum(TreeNode node, int treeHeight, int nodeIndex) {
        if (node == null) {
            return 0;
        }

        if (treeHeight == nodeIndex) {
            return node.val;
        }

        return getSum(node.left, treeHeight, nodeIndex + 1) + getSum(node.right, treeHeight, nodeIndex + 1);
    }

    private int getTreeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(getTreeHeight(node.left), getTreeHeight(node.right)) + 1;
    }
}
