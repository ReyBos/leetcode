package create.target.array.in.the.given.order;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/create-target-array-in-the-given-order/
 *
 * Given two arrays of integers nums and index.
 * Your task is to create target array under the following rules:
 *
 * Initially target array is empty.
 * From left to right read nums[i] and index[i],
 * insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 *
 * It is guaranteed that the insertion operations will be valid.
 *
 * Example:
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 *
 * Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
 * Output: [0,1,2,3,4]
 * Explanation:
 * nums       index     target
 * 1            0        [1]
 * 2            1        [1,2]
 * 3            2        [1,2,3]
 * 4            3        [1,2,3,4]
 * 0            0        [0,1,2,3,4]
 *
 * Input: nums = [1], index = [0]
 * Output: [1]
 *
 * Constraints:
 * 1 <= nums.length, index.length <= 100
 * nums.length == index.length
 * 0 <= nums[i] <= 100
 * 0 <= index[i] <= i
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.5 MB, less than 60.36% of Java online submissions
 */

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] rsl = new int[nums.length];
        Arrays.fill(rsl, -1);
        for (int i = 0; i < index.length; i++) {
            if (rsl[index[i]] == -1 || index[i] + 1 == index.length) {
                rsl[index[i]] = nums[i];
                continue;
            }
            int tmp = rsl[index[i]];
            rsl[index[i]] = nums[i];
            shift(tmp, index[i] + 1, rsl);
        }
        return rsl;
    }

    private void shift(int curElement, int curIndex, int[] arr) {
        int tmp;
        do {
            tmp = arr[curIndex];
            arr[curIndex++] = curElement;
            curElement = tmp;
        } while (curElement != -1);
    }
}
