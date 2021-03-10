package matrix.diagonal.sum;

/**
 * Source: https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements
 * on the secondary diagonal that are not part of the primary diagonal.
 *
 * Example:
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 *
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 *
 * Input: mat = [[5]]
 * Output: 5
 *
 * Constraints:
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 39.3 MB, less than 33.37% of Java online submissions
 */

public class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }
        int rsl = 0;
        int length = mat.length;
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            rsl += mat[i][i];
            rsl += mat[i][j];
        }
        if (length % 2 != 0) {
            rsl -= mat[length / 2][length / 2];
        }
        return rsl;
    }
}
