package com.company.zad1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyHashTable<T> implements HashTable<T> {
    ArrayList<Bucket<T>> list;
    private final int size;

    public MyHashTable() {
        this(16);
    }

    public MyHashTable(int size) {
        list = new ArrayList<>(size);
        for (int i = 0; i<size; i++) list.add(null);
        this.size = size;
    }

    public MyHashTable(ArrayList<T> list) {
        this(list.size());
        for (int i = 0; i< size; i++) Add(list.get(i));
    }

    @Override
    public boolean Add(T object) {
        var hashCode = object.hashCode();
        if (IsInTable(hashCode))
            return false;

        _add(new Bucket<T>(hashCode, object));
        return true;
    }

    private void _add(Bucket<T> bucketToAdd) {
        var index = GetTableIndex(bucketToAdd.getHashCode());
        var bucket = list.get(index);
        if (bucket == null) {
            list.set(index, bucketToAdd);
        } else {
            while (bucket.getNext() != null) bucket = bucket.getNext();
            bucket.setNext(bucketToAdd);
        }
    }

    private boolean IsInTable(int hashCode) {
        var index = GetTableIndex(hashCode);
        var bucket = list.get(index);
        while (bucket != null) {
            if (bucket.getHashCode() == hashCode)
                return true;
            bucket = bucket.getNext();
        }
        return false;
    }

    private int GetTableIndex(int hashCode) {
        return hashCode % size;
    }

    @Override
    public boolean Remove(T object) {
        int hashCode = object.hashCode();
        var index = GetTableIndex(hashCode);
        var bucket = list.get(index);
        if (bucket == null) return false;
        if(bucket.getHashCode() == hashCode){
            list.set(index, bucket.getNext());
            return true;
        }
        while (bucket.getNext() != null){
            if(bucket.getNext().getHashCode() == hashCode){
                bucket.setNext(bucket.getNext().getNext());
                return true;
            }
            bucket = bucket.getNext();
        }
        return false;
    }

    @Override
    public boolean Contains(T object) {
        return IsInTable(object.hashCode());
    }

    @Override
    public Iterator<T> GetIterator() {
        var valuesList = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            var bucket = list.get(i);
            while (bucket != null){
                valuesList.add(bucket.getValue());
                bucket = bucket.getNext();
            }
        }
        return valuesList.iterator();
    }

}
