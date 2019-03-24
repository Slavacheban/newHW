package myCollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss");
        String actual = (String)list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        MyArrayList list = new MyArrayList<String>();
        int espected = list.size();
        list.add("ss");
        list.remove(0);
        int actual = list.size();
        assertEquals(espected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void clear() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss");
        list.add("ss");
        list.add("ss");
        list.clear();
        list.get(0);
    }

    @Test
    public void size() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss1");
        list.add("ss2");
        list.add("ss3");
        Integer actual = 3;
        Integer expected = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss");
        String actual = (String)list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

}