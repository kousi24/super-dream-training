class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null)
            return true;

        if (root == null)
            return false;

        if (sameTree(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;

        if (a == null || b == null || a.val != b.val)
            return false;

        return sameTree(a.left, b.left) &&
               sameTree(a.right, b.right);
    }
}