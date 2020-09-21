package Medium;

import Utility.TreeNode;

public class GetTargetCopy {
    public static void run() {
    }

    TreeNode ans = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(ans != null) return ans;
        if(original == null || cloned == null) return null;

        if(original == target){
            ans = cloned;
        }

        getTargetCopy(original.left, cloned.left, target);
        getTargetCopy(original.right, cloned.right, target);

        return ans;
    }
}
