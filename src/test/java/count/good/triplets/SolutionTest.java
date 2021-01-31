package count.good.triplets;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] arr = new int[] {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        assertEquals(4, solution.countGoodTriplets(arr, a, b, c));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] arr = new int[] {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        assertEquals(0, solution.countGoodTriplets(arr, a, b, c));
    }
}