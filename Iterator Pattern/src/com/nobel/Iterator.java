package com.nobel;

public interface Iterator<T> {
    T getCurrent();
    void next();
    boolean hasNext();
}
