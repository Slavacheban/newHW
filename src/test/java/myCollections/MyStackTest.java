package myCollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void sizeAfterPush() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeAfterClear() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        stack.clear();
        int actual = stack.size();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void checkSize() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void equalsPushPeek() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        String actual = (String)stack.peek();
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void eualsPushPop() {
        MyStack stack = new MyStack<String>();
        stack.push("ss");
        String actual = (String)stack.pop();
        String expected = "ss";
        assertEquals(expected, actual);
    }

}