package to.lower;

/**
 * Source: https://leetcode.com/problems/to-lower-case/
 *
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 *
 * Example:
 * Input: "Hello"
 * Output: "hello"
 *
 * Input: "here"
 * Output: "here"
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * Constraints:
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.8 MB, less than 77.78% of Java online submissions
 */

public class Solution {
    public String toLowerCase(String str) {
        StringBuilder rsl = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            rsl.append(ch);
        }
        return rsl.toString();
    }
}
