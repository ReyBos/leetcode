package longest.substring.without.repeating.characters;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example:
 * Input: s = "abcabcbb"
 * Output: 3
 *
 * Constraints:
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 *
 * Result:
 * Runtime: 77 ms, faster than 14.29% of Java online submissions
 * Memory Usage: 39.8 MB, less than 16.85% of Java online submissions
 */

public class BadSolution {
    public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        Set<Character> substring = new HashSet<>();
        int rsl = 0;
        for (int i = 0; i < str.length; i++) {
            substring.add(str[i]);
            for (int j = (i + 1); j < str.length; j++) {
                if (!substring.add(str[j])) {
                    rsl = Math.max(substring.size(), rsl);
                    substring = new HashSet<>();
                    break;
                }
            }
        }
        rsl = Math.max(substring.size(), rsl);
        return rsl;
    }
}
