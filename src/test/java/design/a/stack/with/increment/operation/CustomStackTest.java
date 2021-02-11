package design.a.stack.with.increment.operation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomStackTest {
    @Test
    public void test() {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (int i = 3; i > 0; i--) {
            assertEquals(i, stack.pop());
        }
        for (int i = 1; i < 4; i++) {
            stack.push(i);
        }
        stack.increment(5, 100);
        stack.increment(2, 100);
        assertEquals(103, stack.pop());
        assertEquals(202, stack.pop());
        assertEquals(201, stack.pop());
        assertEquals(-1, stack.pop());
    }
}