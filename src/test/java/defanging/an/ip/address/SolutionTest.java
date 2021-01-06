package defanging.an.ip.address;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String ip = "1.1.1.1";
        String out = solution.defangIPaddr(ip);
        assertEquals("1[.]1[.]1[.]1", out);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String ip = "255.100.50.0";
        String out = solution.defangIPaddr(ip);
        assertEquals("255[.]100[.]50[.]0", out);
    }
}