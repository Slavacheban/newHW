package myCollections;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    @Test(expected = Exception.class)
    public void shouldAdd() {
        MyArrayList list = new MyArrayList<String>();
        list.add(1);
        String actual = (String)list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        MyArrayList list = new MyArrayList<String>();
        int espected = list.size();
        list.add("ss");
        list.remove(0);
        int actual = list.size();
        assertEquals(espected, actual);
    }

    @Test
    public void shouldClear() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss");
        list.add("ss");
        list.add("ss");
        list.clear();
        int expected = 0;
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void sizeAfterAddThreeElements() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss1");
        list.add("ss2");
        list.add("ss3");
        Integer actual = 3;
        Integer expected = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getAfterAdd() {
        MyArrayList list = new MyArrayList<String>();
        list.add("ss");
        String actual = (String)list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

}