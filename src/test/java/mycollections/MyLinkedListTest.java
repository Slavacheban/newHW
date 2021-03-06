package mycollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    @Test
    public void shouldAdd() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("ss");
        String actual = linkedList.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("ss");
        linkedList.add("sw");
        linkedList.add("sc");
        linkedList.remove(1);
        int actual = linkedList.size();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldClear() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("ss");
        linkedList.clear();
        int  actual = linkedList.size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeAfterAdd() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("ss");
        int actual = linkedList.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getAfterAdd() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("ss");
        String actual = linkedList.get(0);
        String expected = "ss";
        assertEquals(expected, actual);
    }

}