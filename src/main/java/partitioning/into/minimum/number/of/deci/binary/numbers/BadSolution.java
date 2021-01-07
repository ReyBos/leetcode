package partitioning.into.minimum.number.of.deci.binary.numbers;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 *
 * A decimal number is called deci-binary if each of its digits is either 0 or 1
 * without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 *
 * Given a string n that represents a positive decimal integer, return the minimum number of
 * positive deci-binary numbers needed so that they sum up to n.
 *
 * Example:
 * Input: n = "32"
 * Output: 3
 * Explanation: 10 + 11 + 11 = 32
 *
 * Input: n = "82734"
 * Output: 8
 *
 * Input: n = "27346209830709182346"
 * Output: 9
 *
 * Constraints:
 * 1 <= n.length <= 105
 * n consists of only digits.
 * n does not contain any leading zeros and represents a positive integer.
 *
 * Result:
 * Runtime: 259 ms, faster than 5.03% of Java online submissions
 * Memory Usage: 117 MB, less than 5.34% of Java online submissions
 */

public class BadSolution {
    public int minPartitions(String n) {
        return Arrays.stream(n.split(""))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
    }
}
