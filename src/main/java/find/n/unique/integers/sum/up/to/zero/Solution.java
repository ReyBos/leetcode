package find.n.unique.integers.sum.up.to.zero;

/**
 * Source: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 *
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * Example:
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 *
 * Input: n = 3
 * Output: [-1,0,1]
 *
 * Input: n = 1
 * Output: [0]
 *
 * Constraints:
 * 1 <= n <= 1000
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.6 MB, less than 33.91% of Java online submissions
 */

public class Solution {
    public int[] sumZero(int n) {
        int[] rsl = new int[n];
        for (int i = 0; i < n / 2; i++) {
            rsl[i] = i + 1;
            rsl[n - i - 1] = -(i + 1);
        }
        return rsl;
    }
}
