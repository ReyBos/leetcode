package lucky.numbers.in.a.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 *
 * Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 * A lucky number is an element of the matrix such that it is the minimum element
 * in its row and maximum in its column.
 *
 * Example:
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum
 * in its row and the maximum in its column
 *
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum
 * in its row and the maximum in its column.
 *
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5.
 * All elements in the matrix are distinct.
 *
 * Result:
 * Runtime: 1 ms, faster than 98.20% of Java online submissions
 * Memory Usage: 39.5 MB, less than 42.02% of Java online submissions
 */

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rsl = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            if (isMaxInColumn(matrix, minIndex, min)) {
                rsl.add(min);
            }
        }
        return rsl;
    }

    private boolean isMaxInColumn(int[][] matrix, int column, int num) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] > num) {
                return false;
            }
        }
        return true;
    }
}
