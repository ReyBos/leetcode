package binary.tree.inorder.traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 *
 * Input: root = []
 * Output: []
 *
 * Input: root = [1]
 * Output: [1]
 *
 * Input: root = [1,2]
 * Output: [2,1]
 *
 * Input: root = [1,null,2]
 * Output: [1,2]
 *
 * Constraints:
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.5 MB, less than 19.10% of Java online submissions
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rsl = new ArrayList<>();
        getVal(rsl, root);
        return rsl;
    }

    private void getVal(List<Integer> store, TreeNode node) {
        if (node == null) {
            return;
        }
        getVal(store, node.left);
        store.add(node.val);
        getVal(store, node.right);
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