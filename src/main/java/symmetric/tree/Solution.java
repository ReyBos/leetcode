package symmetric.tree;

/**
 * Source: https://leetcode.com/problems/symmetric-tree/
 *
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example:
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 *
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 *
 * Constraints:
 * The number of nodes in the tree is in the range [1, 1000].
 * -100 <= Node.val <= 100
 *
 * Follow up: Could you solve it both recursively and iteratively?
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.5 MB, less than 98.37% of Java online submissions
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode firstTree, TreeNode secondTree) {
        if (firstTree == null && secondTree == null) {
            return true;
        }
        if (firstTree == null || secondTree == null) {
            return false;
        }
        return (firstTree.val == secondTree.val)
                && isEqual(firstTree.left, secondTree.right)
                && isEqual(firstTree.right, secondTree.left);

    }
}