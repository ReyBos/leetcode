package reverse.integer;

/**
 * Source: https://leetcode.com/problems/reverse-integer/
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
 * value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example:
 * Input: x = 123
 * Output: 321
 *
 * Input: x = -123
 * Output: -321
 *
 * Input: x = 120
 * Output: 21
 *
 * Input: x = 0
 * Output: 0
 *
 * Constraints:
 * -2^31 <= x <= 2^31 - 1
 *
 * Result:
 * Runtime: 2 ms, faster than 31.84% of Java online submissions
 * Memory Usage: 36.1 MB, less than 49.38% of Java online submissions
 */

public class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        StringBuilder rsl = new StringBuilder(String.valueOf(x));
        rsl.reverse();
        if (x > 0) {
            String max = String.valueOf(Integer.MAX_VALUE);
            return rsl.length() == 10 && rsl.toString().compareTo(max) > 0 ? 0 : Integer.parseInt(rsl.toString());
        } else {
            rsl.deleteCharAt(rsl.length() - 1);
            rsl.insert(0, "-");
            String min = String.valueOf(Integer.MIN_VALUE);
            return rsl.length() == 11 && rsl.toString().compareTo(min) > 0 ? 0 : Integer.parseInt(rsl.toString());
        }
    }
}
