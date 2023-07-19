package com.company.Collections;

public class Map<K, V> implements MyMap<K, V> {
    private Map<K, V> map;

    public Map(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public boolean put(K key, V value) {
        if (key == null || value == null) {
            throw new NullPointerException("Key or value cannot be null");
        }
        map.put(key, value);
        return true;
    }

    @Override
    public boolean remove(K key, V value) {
        if (key == null || value == null) {
            throw new NullPointerException("Key or value cannot be null");
        }
        boolean remove = map.remove(key, value);
        return remove;
    }

    @Override
    public boolean putAll(K key, V value) {
        if (key == null || value == null) {
            throw new NullPointerException("Key or value cannot be null");
        }
        map.put(key, value);
        return true;
    }
}