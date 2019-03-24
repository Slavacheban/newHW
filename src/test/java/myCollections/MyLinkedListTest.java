package myCollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    @Test
    public void add() {
        MyLinkedList linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        String actual = (String)linkedList.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        MyLinkedList linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        linkedList.add("sw");
        linkedList.add("sc");
        linkedList.remove(1);
        int actual = linkedList.size();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        MyLinkedList linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        linkedList.clear();
        int  actual = linkedList.size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void size() {
        MyLinkedList linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        int actual = linkedList.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        MyLinkedList linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        String actual = (String)linkedList.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

}