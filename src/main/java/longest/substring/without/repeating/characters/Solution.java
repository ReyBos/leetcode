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
 * Runtime: 6 ms, faster than 64.75% of Java online submissions.
 * Memory Usage: 39.3 MB, less than 42.28% of Java online submissions.
 */

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        if (str.length < 2) {
            return str.length;
        }
        Set<Character> substring = new HashSet<>();
        char startChar = str[0], finishChar;
        int start = 0, rsl = 0;
        substring.add(startChar);
        for (int i = 1; i < str.length; i++) {
            finishChar = str[i];
            if (!substring.add(finishChar)) {
                rsl = Math.max(rsl, substring.size());
                do {
                    substring.remove(startChar);
                    startChar = str[++start];
                } while (!substring.add(finishChar));
            }
        }
        rsl = Math.max(rsl, substring.size());
        return rsl;
    }
}
