package decompress.run.length.encoded.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/decompress-run-length-encoded-list/
 *
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 *
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 *
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 *
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 *
 * Constraints:
 * 2 <= nums.length <= 100
 * nums.length % 2 == 0
 * 1 <= nums[i] <= 100
 *
 * Result:
 * Runtime: 8 ms, faster than 5.77% of Java online submissions
 * Memory Usage: 46.6 MB, less than 5.06% of Java online submissions
 */

public class FirstSolution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                tmp.add(nums[i + 1]);
            }
        }
        int[] rsl = new int[tmp.size()];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = tmp.get(i);
        }
        return rsl;
    }
}