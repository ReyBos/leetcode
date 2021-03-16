package sum.of.unique.elements;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/sum-of-unique-elements/
 *
 * You are given an integer array nums. The unique elements of an array are the elements that
 * appear exactly once in the array.
 *
 * Return the sum of all the unique elements of nums.
 *
 * Example:
 * Input: nums = [1,2,3,2]
 * Output: 4
 * Explanation: The unique elements are [1,3], and the sum is 4.
 *
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: There are no unique elements, and the sum is 0.
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 15
 * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Result:
 * Runtime: 1 ms, faster than 75.41% of Java online submissions
 * Memory Usage: 36.7 MB, less than 67.03% of Java online submissions
 */

public class Solution {
    public int sumOfUnique(int[] nums) {
        int rsl = 0;
        Set<Integer> unique = new HashSet<>();
        Set<Integer> notUnique = new HashSet<>();
        for (int num : nums) {
            if (!unique.add(num)) {
                notUnique.add(num);
            }
        }
        for (int num : notUnique) {
            unique.remove(num);
        }
        for (int num : unique) {
            rsl += num;
        }
        return rsl;
    }
}
