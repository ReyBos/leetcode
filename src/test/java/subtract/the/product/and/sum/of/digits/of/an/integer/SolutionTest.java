package subtract.the.product.and.sum.of.digits.of.an.integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        assertEquals(15, solution.subtractProductAndSum(234));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        assertEquals(21, solution.subtractProductAndSum(4421));
    }
}