package validate.stack.sequences;

/**
 * Source: https://leetcode.com/problems/validate-stack-sequences/
 *
 * Given two sequences pushed and popped with distinct values, return true if and only if this could
 * have been the result of a sequence of push and pop operations on an initially empty stack.
 *
 * Example:
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 *
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 *
 * Constraints:
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed is a permutation of popped.
 * pushed and popped have distinct values.
 *
 * Result:
 * Runtime: 1 ms, faster than 95.06% of Java online submissions
 * Memory Usage: 38.7 MB, less than 69.64% of Java online submissions
 */

public class Solution {
    private Stack stack;

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0) {
            return true;
        }
        stack = new Stack(pushed.length);
        int popPoint = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            popPoint = checkPopped(popped, popPoint);
        }
        return popPoint == popped.length;
    }

    private int checkPopped(int[] popped, int popPoint) {
        while (stack.hasNext()) {
            if (stack.peek() == popped[popPoint]) {
                stack.pop();
                popPoint++;
            } else {
                break;
            }
        }
        return popPoint;
    }

    private class Stack {
        int[] data;
        int point = -1;

        public Stack(int size) {
            this.data = new int[size];
        }

        public void push(int val) {
            data[++point] = val;
        }

        public void pop() {
            point--;
        }

        public int peek() {
            return data[point];
        }

        public boolean hasNext() {
            return point != -1;
        }
    }
}
