package jewels.and.stones;

import java.util.HashSet;
import java.util.Set;

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
 * Runtime: 4 ms, faster than 7.26% of Java online submissions for Jewels and Stones.
 * Memory Usage: 39 MB, less than 6.89% of Java online submissions for Jewels and Stones.
 */

public class FirstSolution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> abc = new HashSet<>();
        int rsl = 0;
        for (int i = 0; i < jewels.length(); i++) {
            abc.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (abc.contains(stones.charAt(i))) {
                rsl++;
            }
        }
        return rsl;
    }
}