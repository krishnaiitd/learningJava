package com.oop.concepts;

public interface Number<T extends Number> {
    T add(T t);
}
