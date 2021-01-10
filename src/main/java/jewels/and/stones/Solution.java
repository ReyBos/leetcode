package jewels.and.stones;

/**
 * Source: https://leetcode.com/problems/jewels-and-stones/
 *
 * You're given strings jewels representing the types of stones that are jewels, and stones
 * representing the stones you have. Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 *
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 *
 * Constraints:
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 *
 * Result:
 * Runtime: 1 ms, faster than 70.48% of Java online submissions
 * Memory Usage: 37.3 MB, less than 65.20% of Java online submissions
 */

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int rsl = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    rsl++;
                }
            }
        }
        return rsl;
    }
}
