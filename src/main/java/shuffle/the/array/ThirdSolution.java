package shuffle.the.array;

/**
 * Source: https://leetcode.com/problems/shuffle-the-array/
 *
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 *
 * Input: nums = [1,1,2,2], n = 2
 * Output: [1,2,1,2]
 *
 * Constraints:
 * 1 <= n <= 500
 * nums.length == 2n
 * 1 <= nums[i] <= 10^3
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 39.2 MB, less than 61.48% of Java online submissions
 */

public class ThirdSolution {
    public int[] shuffle(int[] nums, int n) {
        if (n == 1) {
            return nums;
        }
        int[] tmpStorage = new int[n / 2 + 1];
        int tmpLength = tmpStorage.length;
        for (int i = 1; i < nums.length - 1; i++) {
            if (i < n) {
                tmpStorage[(i % tmpLength == 0 ? tmpLength - 1 : i % tmpLength - 1)] = nums[i];
            }
            nums[i] = i % 2 == 0 ? tmpStorage[(i / 2 - 1) % tmpLength] : nums[i / 2 + n];
        }
        return nums;
    }
}