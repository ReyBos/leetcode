package add.two.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when243And564Then708() {
        ListNode head1 = new ListNode(2);
        ListNode next1 = new ListNode(4);
        head1.next = next1;
        next1.next = new ListNode(3);
        ListNode head2 = new ListNode(5);
        ListNode next2 = new ListNode(6);
        head2.next = next2;
        next2.next = new ListNode(4);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(7, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(8, rsl.val);
    }

    @Test
    public void when564And243Then708() {
        ListNode head1 = new ListNode(9);
        ListNode next1 = new ListNode(9);
        head1.next = next1;
        next1.next = new ListNode(9);
        ListNode head2 = new ListNode(9);
        ListNode next2 = new ListNode(9);
        head2.next = next2;
        next2.next = new ListNode(9);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(8, rsl.val);
        rsl = rsl.next;
        assertEquals(9, rsl.val);
        rsl = rsl.next;
        assertEquals(9, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when999And1Then0001() {
        ListNode head1 = new ListNode(9);
        ListNode next1 = new ListNode(9);
        head1.next = next1;
        next1.next = new ListNode(9);
        ListNode head2 = new ListNode(1);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when1And999Then0001() {
        ListNode head1 = new ListNode(9);
        ListNode next1 = new ListNode(9);
        head1.next = next1;
        next1.next = new ListNode(9);
        ListNode head2 = new ListNode(1);
        ListNode rsl = Solution.addTwoNumbers(head2, head1);
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when101And99Then002() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(0);
        head1.next = next1;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(2, rsl.val);
    }

    @Test
    public void when99And101Then002() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(0);
        head1.next = next1;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        ListNode rsl = Solution.addTwoNumbers(head2, head1);
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(0, rsl.val);
        rsl = rsl.next;
        assertEquals(2, rsl.val);
    }

    @Test
    public void when111And22Then331() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(1);
        head1.next = next1;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(2);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when22And111Then331() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(1);
        head1.next = next1;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(2);
        ListNode rsl = Solution.addTwoNumbers(head2, head1);
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when1111And22Then3311() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(1);
        head1.next = next1;
        next1.next = new ListNode(1);
        next1 = next1.next;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(2);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when22And1111Then3311() {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(1);
        head1.next = next1;
        next1.next = new ListNode(1);
        next1 = next1.next;
        next1.next = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(2);
        ListNode rsl = Solution.addTwoNumbers(head2, head1);
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(3, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
        rsl = rsl.next;
        assertEquals(1, rsl.val);
    }

    @Test
    public void when0And0Then0() {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode rsl = Solution.addTwoNumbers(head1, head2);
        assertEquals(0, rsl.val);
    }
}