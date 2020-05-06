package com.company.zad1;

public class Bucket<T>{
    private Bucket<T> Next = null;
    private final int hashCode;
    private final T value;

    public Bucket(int hashCode, T value){
        this.hashCode = hashCode;
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public T getValue() {
        return value;
    }

    public Bucket<T> getNext() {
        return Next;
    }

    public void setNext(Bucket<T> next) {
        Next = next;
    }

}
