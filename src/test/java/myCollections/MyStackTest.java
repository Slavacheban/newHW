package myCollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void push() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int espected = 1;
        assertEquals(espected, actual);
    }

    @Test
    public void clear() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("ss");
        stack.clear();
        int actual = stack.size();
        int espected = 0;
        assertEquals(espected, actual);

    }

    @Test
    public void size() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int espected = 1;
        assertEquals(espected, actual);
    }

    @Test
    public void peek() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("ss");
        String actual = stack.peek();
        String espected = "ss";
        assertEquals(espected, actual);
    }

    @Test
    public void pop() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("ss");
        String actual = stack.pop();
        String espected = "ss";
        assertEquals(espected, actual);
    }
}