package set.mismatch;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/set-mismatch/
 *
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number
 * in the set, which results in repetition of one number and loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 *
 * Example:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Input: nums = [1,1]
 * Output: [1,2]
 *
 * Constraints:
 * 2 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^4
 *
 * Result:
 * Runtime: 9 ms, faster than 41.69% of Java online submissions
 * Memory Usage: 40.6 MB, less than 59.50% of Java online submissions
 */

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int[] rsl = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!numsSet.add(nums[i])) {
                rsl[0] = nums[i];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (numsSet.add(i)) {
                rsl[1] = i;
                break;
            }
        }
        return rsl;
    }
}