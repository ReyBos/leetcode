package sum.of.all.odd.length.subarrays;

/**
 * Source: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 *
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
 *
 * A subarray is a contiguous subsequence of the array.
 *
 * Return the sum of all odd-length subarrays of arr.
 *
 * Example:
 * Input: arr = [1,4,2,5,3]
 * Output: 58
 * Explanation: The odd-length subarrays of arr and their sums are:
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1,4,2] = 7
 * [4,2,5] = 11
 * [2,5,3] = 10
 * [1,4,2,5,3] = 15
 * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 *
 * Input: arr = [1,2]
 * Output: 3
 * Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 *
 * Input: arr = [10,11,12]
 * Output: 66
 *
 * Constraints:
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 1000
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.5 MB, less than 84.79% of Java online submissions
 */

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            return arr[0] + arr[1];
        }
        int[] sumEachElements = arr.length % 2 == 0 ? getSumIfEven(arr) : getSumIfOdd(arr);
        int rsl = 0;
        for (int sum : sumEachElements) {
            rsl += sum;
        }
        return rsl;
    }

    private int[] getSumIfEven(int[] arr) {
        int startPointer = 0;
        int endPointer = arr.length - 1;
        int count = arr.length / 2;
        int[] rsl = new int[arr.length];
        for (int i = count; i > 0; i--) {
            if (i != count) {
                count += i;
            }
            rsl[startPointer] = arr[startPointer++] * count;
            rsl[endPointer] = arr[endPointer--] * count;
        }
        return rsl;
    }

    private int[] getSumIfOdd(int[] arr) {
        int startPointer = 0;
        int endPointer = arr.length - 1;
        int countPointer = (arr.length + 1) / 2;
        int count = 0;
        int pointer = 0;
        int startLoop = (arr.length / 2 % 2) == 0 ? arr.length / 2 + 1 : arr.length / 2;
        int[] rsl = new int[arr.length];
        for (int i = startLoop; i > 0; i--) {
            if (pointer % 2 != 0) {
                countPointer -= 2;
            }
            count += countPointer;
            pointer++;
            rsl[startPointer] = arr[startPointer++] * count;
            rsl[endPointer] = arr[endPointer--] * count;
        }
        if (startPointer == endPointer) {
            rsl[startPointer] = arr[startPointer] * count;
        }
        return rsl;
    }
}
