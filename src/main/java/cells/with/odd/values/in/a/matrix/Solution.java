package cells.with.odd.values.in.a.matrix;

/**
 * Source: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 *
 * Given n and m which are the dimensions of a matrix initialized by zeros and
 * given an array indices where indices[i] = [ri, ci].
 * For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
 *
 * Return the number of cells with odd values in the matrix
 * after applying the increment to all indices.
 *
 * Example:
 * Input: n = 2, m = 3, indices = [[0,1],[1,1]]
 * Output: 6
 * Explanation: Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
 *
 * Input: n = 2, m = 2, indices = [[1,1],[0,0]]
 * Output: 0
 * Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.
 *
 * Constraints:
 * 1 <= n <= 50
 * 1 <= m <= 50
 * 1 <= indices.length <= 100
 * 0 <= indices[i][0] < n
 * 0 <= indices[i][1] < m
 *
 * Result:
 * Runtime: 1 ms, faster than 74.53% of Java online submissions
 * Memory Usage: 36.7 MB, less than 94.15% of Java online submissions
 */

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        int rsl = 0;
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if ((rows[row] + cols[col]) % 2 != 0) {
                    rsl++;
                }
            }
        }
        return rsl;
    }
}
