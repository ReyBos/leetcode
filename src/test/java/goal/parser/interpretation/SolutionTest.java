package goal.parser.interpretation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String command = "G()(al)";
        assertEquals("Goal", solution.interpret(command));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String command = "G()()()()(al)";
        assertEquals("Gooooal", solution.interpret(command));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String command = "(al)G(al)()()G";
        assertEquals("alGalooG", solution.interpret(command));
    }
}