package partitioning.into.minimum.number.of.deci.binary.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when32Then3() {
        Solution solution = new Solution();
        String input = "32";
        assertEquals(3, solution.minPartitions(input));
    }

    @Test
    public void when82734Then8() {
        Solution solution = new Solution();
        String input = "82734";
        assertEquals(8, solution.minPartitions(input));
    }

    @Test
    public void when27346209830709182346Then9() {
        Solution solution = new Solution();
        String input = "27346209830709182346";
        assertEquals(9, solution.minPartitions(input));
    }
}