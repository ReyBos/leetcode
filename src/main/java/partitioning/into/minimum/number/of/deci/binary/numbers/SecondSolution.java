package partitioning.into.minimum.number.of.deci.binary.numbers;

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
 * Runtime: 5 ms, faster than 77.82% of Java online submissions
 * Memory Usage: 51.5 MB, less than 30.13% of Java online submissions
 * Runtime: 5 ms, faster than 77.82% of Java online submissions
 * Memory Usage: 39.8 MB, less than 59.47% of Java online submissions
 */

public class SecondSolution {
    public int minPartitions(String n) {
        int num = 0;
        for (char digit : n.toCharArray()) {
            num = Math.max(num, digit);
            if (num == '9') {
                break;
            }
        }
        return num - '0';
    }
}
