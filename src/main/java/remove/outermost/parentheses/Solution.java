package remove.outermost.parentheses;

/**
 * Source: https://leetcode.com/problems/remove-outermost-parentheses/
 *
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are
 * valid parentheses strings, and + represents string concatenation.  For example,
 * "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way
 * to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string S, consider its primitive decomposition:
 * S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *
 * Return S after removing the outermost parentheses of every primitive string in the primitive
 * decomposition of S.
 *
 * Example:
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 *
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 *
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 *
 * Constraints:
 * S.length <= 10000
 * S[i] is "(" or ")"
 * S is a valid parentheses string
 *
 * Result:
 * Runtime: 2 ms, faster than 99.11% of Java online submissions
 * Memory Usage: 38.8 MB, less than 80.76% of Java online submissions
 */

public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder rsl = new StringBuilder();
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                sum++;
            } else {
                sum--;
            }
            counter++;
            if (sum == 0) {
                if (counter != 2) {
                    int startIndex = i - counter + 1;
                    rsl.append(S, startIndex + 1, i);
                }
                counter = 0;
            }
        }
        return rsl.toString();
    }
}
