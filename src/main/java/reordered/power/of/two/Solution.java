package reordered.power.of.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Source: https://leetcode.com/problems/reordered-power-of-2/
 *
 * Starting with a positive integer N, we reorder the digits in any order
 * (including the original order) such that the leading digit is not zero.
 *
 * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 *
 * Example:
 * Input: 1
 * Output: true
 *
 * Input: 10
 * Output: false
 *
 * Input: 16
 * Output: true
 *
 * Input: 24
 * Output: false
 *
 * Input: 46
 * Output: true
 *
 * Constraints:
 * 1 <= N <= 10^9
 *
 * Result:
 * Runtime: 2 ms, faster than 57.98% of Java online submissions
 * Memory Usage: 35.8 MB, less than 82.35% of Java online submissions
 */

public class Solution {
    public boolean reorderedPowerOf2(int N) {
        if (N == 1) {
            return true;
        }
        int powOfTwo = 1;
        List<Integer> nDigits = getDigitsOfNum(N);
        for (int i = 1; i <= 30; i++) {
            powOfTwo <<= 1;
            List<Integer> powOfTwoDigits = getDigitsOfNum(powOfTwo);
            if (powOfTwoDigits.size() > nDigits.size()) {
                return false;
            }
            nDigits.sort(Comparator.naturalOrder());
            powOfTwoDigits.sort(Comparator.naturalOrder());
            if (Objects.equals(nDigits, powOfTwoDigits)) {
                return true;
            }
        }
        return false;
    }

    private List<Integer> getDigitsOfNum(int num) {
        List<Integer> rsl = new ArrayList<>();
        String numStr = String.valueOf(num);
        for (char digit : numStr.toCharArray()) {
            rsl.add(Character.getNumericValue(digit));
        }
        return rsl;
    }
}
