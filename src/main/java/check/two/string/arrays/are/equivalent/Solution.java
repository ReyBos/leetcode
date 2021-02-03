package check.two.string.arrays.are.equivalent;

/**
 * Source: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 *
 * Given two string arrays word1 and word2,
 * return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 * Example:
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 *
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 *
 * Constraints:
 * 1 <= word1.length, word2.length <= 10^3
 * 1 <= word1[i].length, word2[i].length <= 10^3
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3
 * word1[i] and word2[i] consist of lowercase letters.
 *
 * Result:
 * Runtime: 1 ms, faster than 73.79% of Java online submissions
 * Memory Usage: 38.6 MB, less than 28.74% of Java online submissions
 */

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (String word : word1) {
            first.append(word);
        }
        for (String word : word2) {
            second.append(word);
        }
        return first.toString().equals(second.toString());
    }
}
