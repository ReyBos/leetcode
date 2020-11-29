package median.of.two.sorted.arrays;

/**
 * Source: https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 *
 * Follow up: The overall run time complexity should be O(log (m+n)).
 *
 * Example:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * Result:
 * Runtime: 2 ms, faster than 99.67% of Java online submissions
 * Memory Usage: 39.9 MB, less than 90.79% of Java online submissions
 */

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] rsl = new int[nums1.length + nums2.length];
        if (rsl.length == 0) {
            return 0;
        }
        for (int i = 0, j = 0, k = 0; i < rsl.length; i++) {
            if (j == nums1.length) {
                rsl[i] = nums2[k++];
                continue;
            }
            if (k == nums2.length) {
                rsl[i] = nums1[j++];
                continue;
            }
            if (nums1[j] > nums2[k]) {
                rsl[i] = nums2[k++];
            } else {
                rsl[i] = nums1[j++];
            }
        }
        int mid = rsl.length / 2;
        return rsl.length % 2 == 0 ? (double) (rsl[mid] + rsl[mid - 1]) / 2 : rsl[mid];
    }
}
