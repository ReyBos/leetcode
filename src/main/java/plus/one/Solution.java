package plus.one;

/**
 * Source: https://leetcode.com/problems/plus-one/
 *
 * Given a non-empty array of decimal digits representing a non-negative integer,
 * increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Input: digits = [0]
 * Output: [1]
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.3 MB, less than 81.35% of Java online submissions
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;
        digits[pointer]++;
        while (digits[pointer] > 9) {
            digits[pointer--] -= 10;
            if (pointer == -1) {
                int[] rsl = new int[digits.length + 1];
                rsl[0] = 1;
                System.arraycopy(digits, 0, rsl, 1, digits.length);
                return rsl;
            }
            digits[pointer]++;
        }
        return digits;
    }
}
