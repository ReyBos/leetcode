package add.two.numbers;

/**
 * Source: https://leetcode.com/problems/add-two-numbers/
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * You can return the answer in any order.
 *
 * Example:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * Result:
 * Runtime: 2 ms, faster than 77.18% of Java online submissions for Add Two Numbers.
 * Memory Usage: 39.4 MB, less than 47.13% of Java online submissions for Add Two Numbers.
 */

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum, val1, val2;
        ListNode rsl = new ListNode(0);
        ListNode pointer = rsl;
        do {
            if (pointer.next != null) {
                pointer = pointer.next;
            }
            val1 = l1.val;
            l1 = l1.next;
            if (l2 == null) {
                val2 = 0;
            } else {
                val2 = l2.val;
                l2 = l2.next;
            }
            sum = val1 + val2 + pointer.val;
            pointer.val = sum % 10;
            sum /= 10;
            if (sum > 0) {
                pointer.next = new ListNode(sum);
            } else if (l1 != null) {
                pointer.next = new ListNode(0);
            }
        } while (l1 != null);
        while (l2 != null) {
            if (pointer.next == null) {
                pointer.next = new ListNode(0);
            }
            pointer = pointer.next;
            sum = pointer.val + l2.val;
            pointer.val = sum % 10;
            sum /= 10;
            if (sum > 0) {
                pointer.next = new ListNode(sum);
            }
            l2 = l2.next;
        }
        return rsl;
    }
}
