package find.the.highest.altitude;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {-5, 1, 5, 0, -7};
        assertEquals(1, solution.largestAltitude(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {-4, -3, -2, -1, 4, 3, 2};
        assertEquals(0, solution.largestAltitude(input));
    }
}