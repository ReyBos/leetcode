package subtract.the.product.and.sum.of.digits.of.an.integer;

/**
 * Source: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 *
 * Given an integer number n, return the difference between the product of its digits
 * and the sum of its digits.
 *
 * Example:
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 *
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 *
 * Constraints:
 * 1 <= n <= 10^5
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 35.9 MB, less than 32.78% of Java online submissions
 */

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
