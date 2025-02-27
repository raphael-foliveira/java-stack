package com.stack;

public interface IStack<T> {
  void push(T val);

  T pop() throws EmptyStackException;

  T getHead();

  boolean isEmpty();

}
