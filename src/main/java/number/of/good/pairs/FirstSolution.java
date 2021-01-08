package number.of.good.pairs;

/**
 * Source: https://leetcode.com/problems/number-of-good-pairs/
 *
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 * Example:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 *
 * Input: nums = [1,2,3]
 * Output: 0
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Result:
 * Runtime: 1 ms, faster than 63.59% of Java online submissions
 * Memory Usage: 37.9 MB, less than 6.21% of Java online submissions
 */

public class FirstSolution {
    public int numIdenticalPairs(int[] nums) {
        int rsl = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    rsl++;
                }
            }
        }
        return rsl;
    }
}
