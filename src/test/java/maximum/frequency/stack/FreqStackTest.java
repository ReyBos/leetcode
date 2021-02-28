package maximum.frequency.stack;

import org.junit.Test;

import static org.junit.Assert.*;
public class FreqStackTest {
    @Test
    public void test1() {
        FreqStack stack = new FreqStack();
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
    }

    @Test
    public void test2() {
        FreqStack stack = new FreqStack();
        stack.push(4);
        stack.push(0);
        stack.push(9);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        assertEquals(4, stack.pop());
        stack.push(6);
        assertEquals(6, stack.pop());
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(9, stack.pop());
        assertEquals(0, stack.pop());
        assertEquals(4, stack.pop());
    }
}