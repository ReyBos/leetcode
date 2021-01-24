package xor.operation.in.an.array;

/**
 * Source: https://leetcode.com/problems/xor-operation-in-an-array/
 *
 * Given an integer n and an integer start.
 *
 * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
 *
 * Return the bitwise XOR of all elements of nums.
 *
 * Example:
 * Input: n = 5, start = 0
 * Output: 8
 * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
 * Where "^" corresponds to bitwise XOR operator.
 *
 * Input: n = 4, start = 3
 * Output: 8
 * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
 *
 * Input: n = 1, start = 7
 * Output: 7
 *
 * Input: n = 10, start = 5
 * Output: 2
 *
 * Constraints:
 * 1 <= n <= 1000
 * 0 <= start <= 1000
 * n == nums.length
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 35.9 MB, less than 40.00% of Java online submissions
 */

public class Solution {
    public int xorOperation(int n, int start) {
        int rsl = start;
        for (int i = 1; i < n; i++) {
            rsl ^= (start + 2 * i);
        }
        return rsl;
    }
}
