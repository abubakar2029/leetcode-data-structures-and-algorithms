/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    bool helper(TreeNode* node, int sum, int targetSum) {
        if (node == nullptr)
            return false;
        sum += node->val;

        // if both nodes are null
        if (node->left == nullptr && node->right == nullptr) {
            return sum == targetSum;
        }
        return helper(node->left, sum, targetSum) ||
               helper(node->right, sum, targetSum);
    }
};