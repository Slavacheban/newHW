package myCollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("ss");
        String actual = list.get(0);
        String espected = "ss";
        assertEquals(espected, actual);
    }

    @Test
    public void remove() {
        MyArrayList<String> list = new MyArrayList<String>();
        int espected = list.size();
        list.add("ss");
        list.remove(0);
        int actual = list.size();
        assertEquals(espected, actual);
    }

    @Test
    public void clear() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("ss");
        list.add("ss");
        list.add("ss");
        list.clear();
        int espected = 0;
        int actual = list.size();
        assertEquals(espected, actual);
    }

    @Test
    public void size() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("ss1");
        list.add("ss2");
        list.add("ss3");
        Integer actual = 3;
        Integer espected = list.size();
        assertEquals(espected, actual);
    }

    @Test
    public void get() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("ss");
        String actual = list.get(0);
        String espected = "ss";
        assertEquals(espected, actual);
    }
}