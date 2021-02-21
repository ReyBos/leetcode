package maximum.number;

/**
 * Source: https://leetcode.com/problems/maximum-69-number/
 *
 * Given a positive integer num consisting only of digits 6 and 9.
 *
 * Return the maximum number you can get by changing at most one digit
 * (6 becomes 9, and 9 becomes 6).
 *
 * Example:
 * Input: num = 9669
 * Output: 9969
 * Explanation:
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 *
 * Input: num = 9996
 * Output: 9999
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 *
 * Input: num = 9999
 * Output: 9999
 * Explanation: It is better not to apply any change.
 *
 * Constraints:
 * 1 <= num <= 10^4
 * num's digits are 6 or 9.
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.1 MB, less than 46.68% of Java online submissions
 */

public class Solution {
    public int maximum69Number(int num) {
        int needAdd = 0;
        int digitCapacity = 1000;
        int duplicate = num;
        while (digitCapacity >= 1) {
            if (duplicate / digitCapacity == 6) {
                needAdd = 3 * digitCapacity;
                break;
            }
            duplicate %= digitCapacity;
            digitCapacity /= 10;
        }
        return num + needAdd;
    }
}
