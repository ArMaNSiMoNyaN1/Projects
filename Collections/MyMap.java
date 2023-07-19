package com.company.Collections;

public interface MyMap<K, V> {

    boolean put(K key, V value);

    boolean remove(K key, V value);

    boolean putAll(K key, V value);
}