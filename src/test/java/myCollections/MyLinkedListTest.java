package myCollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        String actual = linkedList.get(0);
        String espected = "ss";
        assertEquals(espected, actual);
    }

    @Test
    public void remove() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        linkedList.add("sw");
        linkedList.add("sc");
        linkedList.remove(1);
        int actual = linkedList.size();
        int espected = 2;
        assertEquals(espected, actual);
    }

    @Test
    public void clear() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        linkedList.clear();
        int  actual = linkedList.size();
        int espected = 0;
    }

    @Test
    public void size() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        int actusl = linkedList.size();
        int espected = 1;
        assertEquals(espected, actusl);
    }

    @Test
    public void get() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("ss");
        String actual = linkedList.get(0);
        String espected = "ss";
        assertEquals(espected, actual);
    }
}