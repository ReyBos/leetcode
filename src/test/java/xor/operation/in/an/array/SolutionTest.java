package xor.operation.in.an.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int out = solution.xorOperation(5, 0);
        assertEquals(8, out);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int out = solution.xorOperation(4, 3);
        assertEquals(8, out);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int out = solution.xorOperation(1, 7);
        assertEquals(7, out);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int out = solution.xorOperation(10, 5);
        assertEquals(2, out);
    }
}