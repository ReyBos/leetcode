package cells.with.odd.values.in.a.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] indices = new int[][] {{0, 1}, {1, 1}};
        assertEquals(6, solution.oddCells(2, 3, indices));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] indices = new int[][] {{1, 1}, {0, 0}};
        assertEquals(0, solution.oddCells(2, 2, indices));
    }
}