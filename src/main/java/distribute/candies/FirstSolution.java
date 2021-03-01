package distribute.candies;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/distribute-candies/
 *
 * Alice has n candies, where the ith candy is of type candyType[i].
 * Alice noticed that she started to gain weight, so she visited a doctor.
 *
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
 * Alice likes her candies very much, and she wants to eat the maximum number of different types
 * of candies while still following the doctor's advice.
 *
 * Given the integer array candyType of length n, return the maximum number of different types
 * of candies she can eat if she only eats n / 2 of them.
 *
 * Example:
 * Input: candyType = [1,1,2,2,3,3]
 * Output: 3
 * Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types,
 * she can eat one of each type.
 *
 * Input: candyType = [1,1,2,3]
 * Output: 2
 * Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3],
 * or [2,3], she still can only eat 2 different types.
 *
 * Input: candyType = [6,6,6,6]
 * Output: 1
 * Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies,
 * she only has 1 type.
 *
 * Constraints:
 * n == candyType.length
 * 2 <= n <= 10^4
 * n is even.
 * -10^5 <= candyType[i] <= 10^5
 *
 * Result:
 * Runtime: 32 ms, faster than 78.62% of Java online submissions
 * Memory Usage: 41.1 MB, less than 66.56% of Java online submissions
 */

public class FirstSolution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int max = candyType.length / 2;
        int rsl = 1;
        int currCandy = candyType[0];
        for (int i = 1; i < candyType.length; i++) {
            if (rsl == max) {
                break;
            }
            if (currCandy != candyType[i]) {
                currCandy = candyType[i];
                rsl++;
            }
        }
        return rsl;
    }
}
