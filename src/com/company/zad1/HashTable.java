package com.company.zad1;

import java.util.Iterator;

public interface HashTable<T> {
    boolean Add(T object);
    boolean Remove(T object);
    boolean Contains(T object);
    Iterator<T> GetIterator();
}
