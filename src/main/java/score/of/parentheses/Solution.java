package score.of.parentheses;

/**
 * Source: https://leetcode.com/problems/score-of-parentheses/
 *
 * Given a balanced parentheses string S, compute the score of the string based on the following rule:
 *
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 *
 * Example:
 * Input: "()"
 * Output: 1
 *
 * Input: "(())"
 * Output: 2
 *
 * Input: "()()"
 * Output: 2
 *
 * Input: "(()(()))"
 * Output: 6
 *
 * Constraints:
 * S is a balanced parentheses string, containing only ( and ).
 * 2 <= S.length <= 50
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.0 MB, less than 73.06% of Java online submissions
 */

public class Solution {
    public int scoreOfParentheses(String S) {
        int count = 0;
        int openParenthesisCount = 0;
        boolean haveClosingParenthesis = false;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                openParenthesisCount++;
                haveClosingParenthesis = false;
            } else {
                if (!haveClosingParenthesis) {
                    count += Math.pow(2, (openParenthesisCount - 1));
                    haveClosingParenthesis = true;
                }
                openParenthesisCount--;
            }
        }
        return count;
    }
}
