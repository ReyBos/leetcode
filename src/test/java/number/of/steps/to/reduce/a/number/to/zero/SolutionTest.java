package number.of.steps.to.reduce.a.number.to.zero;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int rsl = solution.numberOfSteps(14);
        assertEquals(6, rsl);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int rsl = solution.numberOfSteps(8);
        assertEquals(4, rsl);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int rsl = solution.numberOfSteps(123);
        assertEquals(12, rsl);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int rsl = solution.numberOfSteps(0);
        assertEquals(0, rsl);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int rsl = solution.numberOfSteps(1);
        assertEquals(1, rsl);
    }
}