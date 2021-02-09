package arranging.coins;

/**
 * Source: https://leetcode.com/problems/arranging-coins/
 *
 * You have a total of n coins that you want to form in a staircase shape,
 * where every k-th row must have exactly k coins.
 *
 * Given n, find the total number of full staircase rows that can be formed.
 *
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 *
 * Example:
 * n = 5
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * Because the 3rd row is incomplete, we return 2.
 *
 * n = 8
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * Because the 4th row is incomplete, we return 3.
 *
 * Constraints:
 *
 * Result:
 * Runtime: 6 ms, faster than 47.28% of Java online submissions
 * Memory Usage: 36.2 MB, less than 65.40% of Java online submissions
 */

public class Solution {
    public int arrangeCoins(int n) {
        int rsl = 0;
        int step = 1;
        while (n - step >= 0) {
            n -= step;
            step++;
            rsl++;
        }
        return rsl;
    }
}
