package list;

import java.util.NoSuchElementException;

public interface MyList<T> {
    int size();
    T getData(T data) throws NoSuchElementException;
    T get(int index) throws NoSuchElementException;
    void add(T data);
    boolean remove(T data);
    int search(T data);
} // end of List interface