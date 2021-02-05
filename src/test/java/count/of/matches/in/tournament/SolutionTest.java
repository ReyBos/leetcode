package count.of.matches.in.tournament;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when7Then6() {
        Solution solution = new Solution();
        assertEquals(6, solution.numberOfMatches(7));
    }

    @Test
    public void when14Then13() {
        Solution solution = new Solution();
        assertEquals(6, solution.numberOfMatches(7));
    }
}