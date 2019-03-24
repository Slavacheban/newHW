package myCollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void push() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        stack.clear();
        int actual = stack.size();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void size() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void peek() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        String actual = (String)stack.peek();
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void pop() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        String actual = (String)stack.pop();
        String expected = "ss";
        assertEquals(expected, actual);
    }

}