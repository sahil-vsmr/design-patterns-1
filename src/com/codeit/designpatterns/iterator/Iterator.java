package com.codeit.designpatterns.iterator;

public interface Iterator {
    boolean hasNext();
    void next();
    Product current();
}
