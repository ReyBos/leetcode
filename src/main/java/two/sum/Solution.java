package two.sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Constraints:
 * 2 <= nums.length <= 10^3
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
 * Memory Usage: 39.2 MB, less than 55.89% of Java online submissions for Two Sum.
 */

public class Solution {
    private static Map<Integer, Integer> table;

    public static int[] twoSum(int[] nums, int target) {
        table = new HashMap<>((int) (nums.length * 1.4));
        int key;
        Integer indexInMap;
        for (int index = 0; index < nums.length; index++) {
            key = target - nums[index];
            indexInMap = table.get(nums[index]);
            if (indexInMap != null) {
                return new int[]{indexInMap, index};
            } else {
                table.put(key, index);
            }
        }
        return new int[]{};
    }
}