package palindrome.number;

/**
 * Source: https://leetcode.com/problems/palindrome-number/
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example,
 * 121 is palindrome while 123 is not.
 *
 * Example:
 * Input: x = 121
 * Output: true
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 * Therefore it is not a palindrome.
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Input: x = -101
 * Output: false
 *
 * Constraints:
 * -2^31 <= x <= 2^31 - 1
 *
 * Result:
 * Runtime: 6 ms, faster than 99.96% of Java online submissions
 * Memory Usage: 38 MB, less than 91.71% of Java online submissions
 */

public class Solution {
    public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		} else if (x < 10) {
			return true;
		}
		int clone = x;
		int reverted = 0;
		while (clone > 0) {
			reverted = reverted * 10 + clone % 10;
			clone /= 10;
		}
		return x == reverted;
    }
}
