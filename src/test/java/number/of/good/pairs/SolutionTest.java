package number.of.good.pairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 2, 3, 1, 1, 3};
        assertEquals(4, solution.numIdenticalPairs(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 1, 1, 1};
        assertEquals(6, solution.numIdenticalPairs(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 2, 3};
        assertEquals(0, solution.numIdenticalPairs(input));
    }
}