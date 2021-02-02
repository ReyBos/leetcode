package split.a.string.in.balanced.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String input = "RLRRLLRLRL";
        assertEquals(4, solution.balancedStringSplit(input));
    }

    @Test
    public void tes21() {
        Solution solution = new Solution();
        String input = "RLLLLRRRLR";
        assertEquals(3, solution.balancedStringSplit(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String input = "LLLLRRRR";
        assertEquals(1, solution.balancedStringSplit(input));
    }
    
    @Test
    public void test4() {
        Solution solution = new Solution();
        String input = "RLRRRLLRLL";
        assertEquals(2, solution.balancedStringSplit(input));
    }
}