package longest.word.in.dictionary.through.deleting;

import java.util.List;

/**
 * Source: https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 *
 * Given a string and a string dictionary, find the longest string in the dictionary
 * that can be formed by deleting some characters of the given string. If there are more than one
 * possible results, return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.
 *
 * Example:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output:
 * "apple"
 *
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * Output:
 * "a"
 *
 * Constraints:
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 *
 * Result:
 * Runtime: 7 ms, faster than 98.60% of Java online submissions
 * Memory Usage: 39.6 MB, less than 92.60% of Java online submissions
 */

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        String rsl = "";
        start: for (String str : d) {
            int currIndex = s.indexOf(str.charAt(0));
            if (currIndex == -1) {
                continue;
            }
            int nextIndex;
            for (int i = 1; i < str.length(); i++) {
                nextIndex = s.indexOf(str.charAt(i), (currIndex + 1));
                if (nextIndex == -1) {
                    continue start;
                }
                currIndex = nextIndex;
            }
            if (str.length() > rsl.length()) {
                rsl = str;
            } else if (str.length() == rsl.length() && rsl.compareTo(str) > 0) {
                rsl = str;
            }
        }
        return rsl;
    }
}
