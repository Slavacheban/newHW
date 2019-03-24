package myCollections;

public class MyLinkedList<T> implements MyList<T> {

    private MyNode<T> first;
    private MyNode<T> last;
    private int size;

    public MyLinkedList() {
        first = new MyNode<T>(null, null, null);
        last = first;
        size = 0;
    }

    public void add(T t) {
        MyNode<T> node = new MyNode<T>(last, null, t);
        if (size == 0) {
            first = node;
        }
        last.setNext(node);
        last = node;
        size++;
    }

    public void remove(int i) {
        MyNode<T> remNode = first;
        if (i == 0) {
            first.getNext().setPrev(null);
            first = first.getNext();
            size--;
        } else {
            for (int j = 1; j < i; j++) {
                remNode = remNode.getNext();
            }
            remNode.getPrev().setNext(remNode.getNext());
            remNode.getNext().setPrev(remNode.getPrev());
            size--;
        }
    }

    public void clear() {
        first = new MyNode<T>(null, null, null);
        last = first;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        try {
            MyNode<T> findNode = first;
            for (int j = 1; j < i; j++) {
                findNode = findNode.getNext();
            }
            return findNode.getT();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
