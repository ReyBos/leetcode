package find.numbers.with.even.number.of.digits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {12, 345, 2, 6, 7896};
        assertEquals(2, solution.findNumbers(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {555, 901, 482, 1771};
        assertEquals(1, solution.findNumbers(input));
    }
}