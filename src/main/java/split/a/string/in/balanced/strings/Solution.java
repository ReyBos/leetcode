package split.a.string.in.balanced.strings;

/**
 * Source: https://leetcode.com/problems/split-a-string-in-balanced-strings/
 *
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 *
 * Given a balanced string s split it in the maximum amount of balanced strings.
 *
 * Return the maximum amount of splitted balanced strings.
 *
 * Example:
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL",
 * each substring contains same number of 'L' and 'R'.
 *
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR",
 * each substring contains same number of 'L' and 'R'.
 *
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 *
 * Input: s = "RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL", "RRRLLRLL",
 * since each substring contains an equal number of 'L' and 'R'
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s[i] = 'L' or 'R'
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 38.5 MB, less than 12.88% of Java online submissions
 */

public class Solution {
    public int balancedStringSplit(String s) {
        int rsl = 0;
        int store = 0;
        for (char ch : s.toCharArray()) {
            store += ch == 'L' ? 1 : -1;
            if (store == 0) {
                rsl++;
            }
        }
        return rsl;
    }
}