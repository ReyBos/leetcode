package longest.palindromic.substring;

/**
 * Source: https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example:
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters (lower-case and/or upper-case),
 *
 * Result:
 * Runtime: 101 ms, faster than 40.26% of Java online submissions
 * Memory Usage: 39.5 MB, less than 46.51% of Java online submissions
 */

public class Solution {
    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        StringBuilder strWithDelimiter = new StringBuilder();
        strWithDelimiter.append("#");
        for (char ch : str) {
            strWithDelimiter.append(ch);
            strWithDelimiter.append('#');
        }
        int[] rsl = new int[strWithDelimiter.length()];
        for (int i = 1; i < strWithDelimiter.length() - 1; i++) {
            rsl[i] = getRadius(strWithDelimiter, i);
        }
        int center = 0, radius = rsl[0];
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i] > radius) {
                center = i;
                radius = rsl[i];
            }
        }
        return strWithDelimiter.substring((center - radius), (center + radius + 1))
                .replaceAll("#", "");
    }

    private int getRadius(StringBuilder str, int center) {
        int i = center - 1;
        int len = str.length() - 1;
        for (int j = center + 1; i > 0 && j < len; i--, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                return center - i - 1;
            }
        }
        return center - i;
    }
}
