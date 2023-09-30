package list;

import java.util.NoSuchElementException;

public class DoublyLinkedCircularList<T> implements MyList<T> {
    private Node<T> head;
    private int size = 0;

    @Override
    public int size() {
        return size;
    } // end of size method

    @Override
    public T getData(T data) throws NoSuchElementException {
        Node<T> currentCurr = head;
        do {
            if (currentCurr.getData().equals(data))
                return currentCurr.getData();
            currentCurr = currentCurr.getNext();
        } while (currentCurr != head);
        throw new NoSuchElementException();
    } // end of getData method

    @Override
    public T get(int index) throws NoSuchElementException {
        Node<T> currentCurr = head;
        for (int i = 0; i < size(); i++) {
            if (i == index)
                return currentCurr.getData();
            currentCurr = currentCurr.getNext();
        }
        throw new NoSuchElementException();
    } // end of get method

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentCurr = head;
            while (currentCurr.getNext() != head)
                currentCurr = currentCurr.getNext();

            currentCurr.setNext(newNode);
            newNode.setPrevious(currentCurr);
        }
        newNode.setNext(head);
        head.setPrevious(newNode);
        size++;
    } // end of add method

    @Override
    public boolean remove(T data) {
        Node<T> currentCurr = head;
        Node<T> previousCurr = head.getPrevious();

        do {
            if (currentCurr.getData().equals(data)) {
                if (previousCurr == head.getPrevious()) {
                    if (currentCurr.getNext() == head)
                        head = null;
                    else {
                        head = currentCurr.getNext();
                        Node<T> lastNode = head;
                        while (lastNode.getNext() != currentCurr)
                            lastNode = lastNode.getNext();

                        lastNode.setNext(head);
                        head.setPrevious(lastNode);
                    }
                } else {
                    previousCurr.setNext(currentCurr.getNext());
                    currentCurr.getNext().setPrevious(previousCurr);
                }
                size--;
                return true;
            }
            previousCurr = currentCurr;
            currentCurr = currentCurr.getNext();
        } while (currentCurr != head);
        return false;
    } // end of remove method

    @Override
    public int search(T data) {
        int position = size() - 1;
        Node<T> currentCurr = head.getPrevious();
        do {
            if (currentCurr.getData().equals(data))
                return position;

            currentCurr = currentCurr.getPrevious();
            position--;
        } while (currentCurr != head.getPrevious());
        return -1;
    } // end of search method
} // end of DoublyLinkedList class
