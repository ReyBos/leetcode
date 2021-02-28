package maximum.frequency.stack;

/**
 * Source: https://leetcode.com/problems/maximum-frequency-stack/
 *
 * Implement FreqStack, a class which simulates the operation of a stack-like data structure.
 *
 * FreqStack has two functions:
 *  push(int x), which pushes an integer x onto the stack.
 *  pop(), which removes and returns the most frequent element in the stack.
 *      If there is a tie for most frequent element,
 *      the element closest to the top of the stack is removed and returned.
 *
 * Example:
 * Input:
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * Output: [null,null,null,null,null,null,null,5,7,5,4]
 * Explanation:
 * After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:
 *
 * pop() -> returns 5, as 5 is the most frequent.
 * The stack becomes [5,7,5,7,4].
 *
 * pop() -> returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
 * The stack becomes [5,7,5,4].
 *
 * pop() -> returns 5.
 * The stack becomes [5,7,4].
 *
 * pop() -> returns 4.
 * The stack becomes [5,7].
 *
 * Constraints:
 * Calls to FreqStack.push(int x) will be such that 0 <= x <= 10^9.
 * It is guaranteed that FreqStack.pop() won't be called if the stack has zero elements.
 * The total number of FreqStack.push calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.pop calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.
 *
 * Result:
 * Runtime: 27 ms, faster than 64.31% of Java online submissions
 * Memory Usage: 48.1 MB, less than 74.78% of Java online submissions
 */

import java.util.*;

public class FreqStack {
    private final Map<Integer, Stack<Integer>> elements = new HashMap<>();
    private final Map<Integer, Integer> elementsCount = new HashMap<>();
    int maxCount = 0;

    public FreqStack() { }

    public void push(int x) {
        int elementCount = elementsCount.getOrDefault(x, 0) + 1;
        elementsCount.put(x, elementCount);
        if (elementCount > maxCount) {
            maxCount = elementCount;
        }
        elements.putIfAbsent(elementCount, new Stack<>());
        elements.get(elementCount).push(x);
    }

    public int pop() {
        int elem = elements.get(maxCount).pop();
        if (elements.get(maxCount).size() == 0) {
            maxCount--;
        }
        int newElementsCount = elementsCount.get(elem) - 1;
        elementsCount.put(elem, newElementsCount);
        return elem;
    }
}