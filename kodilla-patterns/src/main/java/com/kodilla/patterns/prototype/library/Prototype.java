package com.kodilla.patterns.prototype.library;

public class Prototype<V> implements Cloneable {

    @Override
    public V clone() throws CloneNotSupportedException {
        return (V) super.clone();
    }
}
