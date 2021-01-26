package widest.vertical.area.between.two.points.containing.no.points;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] input = new int[][] {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        assertEquals(1, solution.maxWidthOfVerticalArea(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] input = new int[][] {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        assertEquals(3, solution.maxWidthOfVerticalArea(input));
    }
}