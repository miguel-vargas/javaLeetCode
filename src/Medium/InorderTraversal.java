package Medium;

import Utility.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    // ans = 7 4 2 5 1 3 6 8
    public static void run() {
        InorderTraversal runner = new InorderTraversal();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));

        List<Integer> answer = runner.inorderTraversal(root);

        System.out.println(answer);
    }

    List<Integer> answer;

    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();

        dfs(root);

        return answer;
    }

    public void dfs(TreeNode node) {
        if (node == null)
            return;

        dfs(node.left);
        answer.add(node.val);
        dfs(node.right);
    }
}
