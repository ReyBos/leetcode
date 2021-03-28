package count.negative.numbers.in.a.sorted.matrix;

/**
 * Source: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 *
 * Example:
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 *
 * Input: grid = [[3,2],[1,0]]
 * Output: 0
 *
 * Input: grid = [[1,-1],[-1,-1]]
 * Output: 3
 *
 * Input: grid = [[-1]]
 * Output: 1
 *
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 100
 * -100 <= grid[i][j] <= 100
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 39.5 MB, less than 44.59% of Java online submissions
 */

public class Solution {
    public int countNegatives(int[][] grid) {
        int rsl = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    rsl += grid[i].length - j;
                    break;
                }
            }
        }
        return rsl;
    }
}
