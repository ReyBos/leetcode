package minimum.time.visiting.all.points;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] input = new int[][] {{1, 1}, {3, 4}, {-1, 0}};
        assertEquals(7, solution.minTimeToVisitAllPoints(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] input = new int[][] {{3, 2}, {-2, 2}};
        assertEquals(5, solution.minTimeToVisitAllPoints(input));
    }
}