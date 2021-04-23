package same.tree;

/**
 * Source: https://leetcode.com/problems/same-tree/
 *
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 *
 * Example:
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 *
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 *
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 * Constraints:
 * The number of nodes in both trees is in the range [0, 100].
 * -10^4 <= Node.val <= 10^4
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.4 MB, less than 50.68% of Java online submissions
 */

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isNodeEquals(p, q);
    }

    private boolean isNodeEquals(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        boolean rsl = p.val == q.val;
        rsl &= isNodeEquals(p.left, q.left);
        rsl &= isNodeEquals(p.right, q.right);
        return rsl;
    }
}

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