package com.company.Collections;

import java.util.Collection;

public class LinkedList<T> implements MyLinkedList<T> {

    private MyNode<T> first;
    private MyNode<T> last;
    private int size = 0;

    public MyNode<T> getFirst() {
        return first;
    }

    public MyNode<T> getLast() {
        return last;
    }

    @Override
    public boolean add(T t) {
        MyNode node = new MyNode<>(t, null, last);
        if (last == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
        return false;
    }

    @Override
    public boolean remove(T t) {
        if (first == null) {
            return false;
        } else {
            if (size == 1) {
                if (first.value.equals(t)) {
                    first = null;
                    last = null;
                }
            } else {
                MyNode<T> element = first;
                while (element != null) {
                    if (element.value == t) {
                        element.previous.setNext(element.next);
                        if (element.next != null) {
                            element.next.setPrevious(element.previous);
                        }
                        return true;
                    }
                    element = element.next;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<T> collection) {
        T[] arr = (T[]) collection.toArray();
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        for (T element : collection) {
            add(element);
        }
        return true;
    }

    @Override
    public boolean addFirst(T t) {
        MyNode node = new MyNode<>(t, first, null);
        if (first != null) {
            first.previous = node;
        }
        first = node;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private class MyNode<T> {
        private T value;
        private MyNode<T> next;
        private MyNode<T> previous;

        public MyNode(T value, MyNode<T> next, MyNode<T> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(MyNode<T> next) {
            this.next = next;
        }

        public void setPrevious(MyNode<T> previous) {
            this.previous = previous;
        }
    }
}