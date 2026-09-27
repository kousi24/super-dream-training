class Solution {
    List<Integer> ans = new ArrayList<>();
    int prev = 0, count = 0, max = 0;
    boolean first = true;

    public int[] findMode(TreeNode root) {
        inorder(root);
        return ans.stream().mapToInt(i -> i).toArray();
    }

    void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (!first && root.val == prev)
            count++;
        else
            count = 1;

        if (count > max) {
            ans.clear();
            ans.add(root.val);
            max = count;
        } else if (count == max) {
            ans.add(root.val);
        }

        prev = root.val;
        first = false;

        inorder(root.right);
    }
}