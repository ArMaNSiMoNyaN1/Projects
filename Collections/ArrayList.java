package com.company.Collections;

import java.util.Collection;

public class ArrayList<T> implements MyArrayList<T> {

    private int size;
    private int[] array;
    private Object[] elements;

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index - " + index + " Size - " + size);
        }
        return array[index];
    }

    @Override
    public void add(int index) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = index;
        size++;
    }

    @Override
    public void addIndexed(int index, T t) {
        if (index >= 0 && index <= size()) {
            add(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }


    @Override
    public void addAll(Collection<T> elements) {
        for (T element : elements) {
            addIndexed(size, element);
        }
    }


    @Override
    public boolean remove(int index, T t) {
        if (index < 0 || index >= size) {
            return false;
        }
        if ((elements[index] != null && elements[index].equals(t))) {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}

