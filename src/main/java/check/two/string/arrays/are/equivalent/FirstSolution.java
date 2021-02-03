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
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 *
 * Result:
 * Runtime: 2 ms, faster than 32.70% of Java online submissions
 * Memory Usage: 38.8 MB, less than 17.72% of Java online submissions
 */

public class FirstSolution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int partWord2Index = 0;
        int charPartWord2Index = 0;
        for (String word : word1) {
            for (char ch : word.toCharArray()) {
                if (
                        partWord2Index == word2.length
                                || word2[partWord2Index].charAt(charPartWord2Index++) != ch
                ) {
                    return false;
                }
                if (charPartWord2Index == word2[partWord2Index].length()) {
                    charPartWord2Index = 0;
                    partWord2Index++;
                }
            }
        }
        return partWord2Index == word2.length;
    }
}
