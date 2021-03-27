package n.repeated.element.in.size.two.n.array;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 *
 * In a array A of size 2N, there are N+1 unique elements,
 * and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 *
 * Example:
 * Input: [1,2,3,3]
 * Output: 3
 *
 * Input: [2,1,2,5,3,2]
 * Output: 2
 *
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 *
 * Constraints:
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 *
 * Result:
 * Runtime: 9 ms, faster than 33.44% of Java online submissions
 * Memory Usage: 40.1 MB, less than 39.51% of Java online submissions
 */

public class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int n = A.length / 2;
        int counter = 0;
        for (int i = 0; i < A.length - 1; i++) {
            counter++;
            if (A[i] != A[i + 1]) {
                if (counter == n) {
                    return A[i];
                }
                counter = 0;
            }
        }
        return A[A.length - 1];
    }
}
