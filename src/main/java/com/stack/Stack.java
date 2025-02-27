package com.stack;

public interface Stack<T> {
  void push(T val);

  T pop() throws EmptyStackException;

  T getHead();

  boolean isEmpty();

}
