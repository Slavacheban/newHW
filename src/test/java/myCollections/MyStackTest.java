package myCollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {

    @Test
    public void shouldPush() {
        MyStack<String> stack = new MyStack<>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldClear() {
        MyStack<String> stack = new MyStack<>();
        stack.push("ss");
        stack.clear();
        int actual = stack.size();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void sizeAfterPush() {
        MyStack<String> stack = new MyStack<>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void peekAfterPush() {
        MyStack<String> stack = new MyStack<>();
        stack.push("ss");
        String actual = stack.peek();
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void popAfterPush() {
        MyStack<String> stack = new MyStack<>();
        stack.push("ss");
        String actual = stack.pop();
        String expected = "ss";
        assertEquals(expected, actual);
    }

}