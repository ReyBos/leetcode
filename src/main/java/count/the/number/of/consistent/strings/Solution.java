package count.the.number.of.consistent.strings;

/**
 * Source: https://leetcode.com/problems/count-the-number-of-consistent-strings/
 *
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * Example:
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since
 * they only contain characters 'a' and 'b'.
 *
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 *
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 *
 * Constraints:
 * 1 <= words.length <= 10^4
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * The characters in allowed are distinct.
 * words[i] and allowed contain only lowercase English letters.
 *
 * Result:
 * Runtime: 13 ms, faster than 40.83% of Java online submissions
 * Memory Usage: 39.8 MB, less than 66.26% of Java online submissions
 */

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        boolean isAllowed = true;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    isAllowed = false;
                    break;
                }
            }
            if (isAllowed) {
                counter++;
            } else {
                isAllowed = true;
            }
        }
        return counter;
    }
}
