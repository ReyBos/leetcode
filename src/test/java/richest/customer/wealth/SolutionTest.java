package richest.customer.wealth;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void max6() {
        int[][] input = new int[][] {
                {1, 2, 3},
                {3, 2, 1}
        };
        Solution solution = new Solution();
        int rsl = solution.maximumWealth(input);
        assertTrue(rsl == 6);
    }

    @Test
    public void max10() {
        int[][] input = new int[][] {
                {1, 5},
                {7, 3},
                {2, 6}
        };
        Solution solution = new Solution();
        int rsl = solution.maximumWealth(input);
        assertTrue(rsl == 10);
    }

    @Test
    public void max17() {
        int[][] input = new int[][] {
                {2, 8, 7},
                {7, 3, 1},
                {2, 6, 5}
        };
        Solution solution = new Solution();
        int rsl = solution.maximumWealth(input);
        assertTrue(rsl == 17);
    }
}