package mycollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    @Test(expected = Exception.class)
    public void shouldAdd() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("ss");
        String actual = list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        MyArrayList<String> list = new MyArrayList<>();
        int espected = list.size();
        list.add("ss");
        list.remove(0);
        int actual = list.size();
        assertEquals(espected, actual);
    }

    @Test
    public void shouldClear() {
        MyArrayList<String> list = new MyArrayList<>();
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
        MyArrayList<String> list = new MyArrayList<>();
        list.add("ss1");
        list.add("ss2");
        list.add("ss3");
        Integer actual = 3;
        Integer expected = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getAfterAdd() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("ss");
        String actual = list.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

}