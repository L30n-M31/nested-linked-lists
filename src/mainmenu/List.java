package mainmenu;

import java.util.LinkedList;

public interface List {
    void viewList(LinkedList<Object> list);
    void add(LinkedList<Object> list);
    void remove(LinkedList<Object> list);
    void clear(LinkedList<Object> list);
    void export(LinkedList<Object> list);
} // end of List interface