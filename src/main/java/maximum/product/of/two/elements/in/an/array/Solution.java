package maximum.product.of.two.elements.in.an.array;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * Example:
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum
 * value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 *
 * Input: nums = [1,5,4,5]
 * Output: 16
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0),
 * you will get the maximum value of (5-1)*(5-1) = 16.
 *
 * Input: nums = [3,7]
 * Output: 12
 *
 * Constraints:
 * 2 <= nums.length <= 500
 * 1 <= nums[i] <= 10^3
 *
 * Result:
 * Runtime: 1 ms, faster than 67.58% of Java online submissions
 * Memory Usage: 38.9 MB, less than 26.59% of Java online submissions
 */

public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
