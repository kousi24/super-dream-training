class Solution {
public:
    TreeNode* insert(vector<int>& preorder, int& i, int bound) {

        // Stop if all elements are processed or
        // the current value exceeds the allowed upper bound
        if (i >= preorder.size() || preorder[i] > bound)
            return NULL;

        // Create the current root and consume this value
        TreeNode* root = new TreeNode(preorder[i++]);

        // Left subtree values must be smaller than root->val
        root->left = insert(preorder, i, root->val);

        // Right subtree values must respect the parent's bound
        root->right = insert(preorder, i, bound);

        return root;
    }

    TreeNode* bstFromPreorder(vector<int>& preorder) {
        int i = 0;

        // Initially, every valid input value is allowed
        return insert(preorder, i, INT_MAX);
    }
};