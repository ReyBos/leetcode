package trapping.rain.water;

/**
 * Source: https://leetcode.com/problems/trapping-rain-water/
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * Example:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 * Constraints:
 * n == height.length
 * 0 <= n <= 3 * 10^4
 * 0 <= height[i] <= 10^5
 *
 * Result:
 * Runtime: 4 ms, faster than 12.54% of Java online submissions
 * Memory Usage: 40 MB, less than 11.96% of Java online submissions
 */

public class Solution {
    public int trap(int[] height) {
        int rsl = 0;
        int startIndex = 0;
        int leftIndex = -1, rightIndex = -1;
        while ((leftIndex == -1 || rightIndex == -1) && startIndex + 1 < height.length) {
            // тут ищем края первого углубления, например в [3, 1, 2, 3, 4, 0, 2, 4, 5] это будут
            // элементы с индексами 0 и 4
            ++startIndex;
            leftIndex = findTallestLeft(height[startIndex], startIndex, height);
            rightIndex = findTallestRight(height[startIndex], startIndex, height);
        }
        if (leftIndex != -1 && rightIndex != -1) {
            // если углубления найдены ищем их объем
            loop: for (int i = startIndex; i < height.length - 1; i++) {
                while ((height[i] >= height[leftIndex] || rightIndex == i) && i < height.length - 1) {
                    // это ситуация когда переходим через бугор, например [3, 1, 2, 3, 4, 0, 2, 4, 5]
                    // - вот тут мы достигли элемента с индесом 3 который является "бугром"
                    leftIndex = i;
                    rightIndex = -1;
                    i++;
                    if (leftIndex + 2 == height.length) {
                        // ситуация когда мы достигли предпоследнего индекса например 7
                        // в данном массиве [3, 1, 2, 3, 4, 0, 2, 4, 5]
                        break loop;
                    }
                }
                if (rightIndex == -1) {
                    //значит левый индекс менялся, нужно найти новую возвышенность справа
                    rightIndex = findTallestRight(height[i], i, height);
                    if (rightIndex == -1) {
                        continue;
                    }
                }
                int curMaxHeight = Math.min(height[leftIndex], height[rightIndex]);
                rsl += curMaxHeight - height[i];
            }
        }
        return rsl;
    }

    private int findTallestLeft(int currHeight, int index, int[] height) {
        int rsl = -1;
        for (int i = index - 1; i >= 0; i--) {
            if (height[i] > currHeight) {
                rsl = i;
                currHeight = height[i];
            }
        }
        return rsl;
    }

    private int findTallestRight(int currHeight, int index, int[] height) {
        int rsl = -1;
        for (int i = index + 1; i < height.length; i++) {
            if (height[i] > currHeight) {
                rsl = i;
                currHeight = height[i];
            }
        }
        return rsl;
    }
}
