package com.company.zad2;

import com.company.zad1.MyHashTable;

public class SubSetAlgorithm<T> {
    MyHashTable<T> set;
    public SubSetAlgorithm(MyHashTable<T> set){
        this.set = set;
    }

    public boolean IsSubSet(MyHashTable<T> set){
        var iterator = set.GetIterator();
        while (iterator.hasNext()){
            T object = iterator.next();
            boolean contains = this.set.Contains(object);
            if (!contains) return false;
        }
        return true;
    }
}
