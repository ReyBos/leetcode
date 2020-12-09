package zig.zag.conversion;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when1Row() {
        Solution rsl = new Solution();
        String input = "P";
        String out = rsl.convert(input, 1);
        String expected = "P";
        assertThat(out, is(expected));
    }

    @Test
    public void when1RowAB() {
        Solution rsl = new Solution();
        String input = "AB";
        String out = rsl.convert(input, 1);
        String expected = "AB";
        assertThat(out, is(expected));
    }

    @Test
    public void when2RowABCDEF() {
        Solution rsl = new Solution();
        String input = "ABCDEF";
        String out = rsl.convert(input, 2);
        String expected = "ACEBDF";
        assertThat(out, is(expected));
    }

    @Test
    public void when3Rows() {
        Solution rsl = new Solution();
        String input = "PAYPALISHIRING";
        String out = rsl.convert(input, 3);
        String expected = "PAHNAPLSIIGYIR";
        assertThat(out, is(expected));
    }

    @Test
    public void when4Rows() {
        Solution rsl = new Solution();
        String input = "PAYPALISHIRING";
        String out = rsl.convert(input, 4);
        String expected = "PINALSIGYAHRPI";
        assertThat(out, is(expected));
    }
}