package com.company.Collections;

import java.util.Collection;

public interface MyLinkedList<T> {
    boolean add(T t);

    boolean remove(T t);

    boolean addAll(Collection<T> collection);

    boolean addFirst(T t);

    int size();

}