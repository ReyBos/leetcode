package self.dividing.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/self-dividing-numbers/
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number,
 * including the bounds if possible.
 *
 * Example:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 * Constraints:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 * Result:
 * Runtime: 1 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.6 MB, less than 81.69% of Java online submissions
 */

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rsl = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            checkNum(i, rsl);
        }
        return rsl;
    }

    private void checkNum(int num, List<Integer> rsl) {
        boolean needAdd = true;
        int tmpNum = num;
        while (tmpNum > 0) {
            int curDigit = tmpNum % 10;
            tmpNum /= 10;
            if (curDigit == 0 || num % curDigit != 0) {
                needAdd = false;
                break;
            }
        }
        if (needAdd) {
            rsl.add(num);
        }
    }
}
