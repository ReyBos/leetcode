package jewels.and.stones;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int rsl = solution.numJewelsInStones(jewels, stones);
        assertEquals(3, rsl);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String jewels = "z";
        String stones = "ZZ";
        int rsl = solution.numJewelsInStones(jewels, stones);
        assertEquals(0, rsl);
    }
}