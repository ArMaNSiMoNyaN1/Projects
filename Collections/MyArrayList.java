package com.company.Collections;
import java.util.Collection;

public interface MyArrayList<T> {

    int get(int index);

    void add(int index);

    void addIndexed(int index, T t);

    void addAll(Collection<T> elements);

    boolean remove(int index, T t);

    boolean removeAll();

    int size();
}
