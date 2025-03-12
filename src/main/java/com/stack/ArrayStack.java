package com.stack;

public class ArrayStack<T> implements Stack<T> {
  private final int DEFAULT_CAPACITY = 5;
  private Object[] arr;
  private int capacity;
  private int head;

  public ArrayStack() {
    capacity = DEFAULT_CAPACITY;
    arr = new Object[capacity];
    head = -1;
  }

  public ArrayStack(T headValue) {
    capacity = DEFAULT_CAPACITY;
    arr = new Object[capacity];
    head = 0;
    arr[head] = headValue;
  }

  public void push(T val) {
    if (head == capacity - 1) {
      increaseCapacity();
    }

    head++;
    arr[head] = val;
  }

  private void increaseCapacity() {
    int newCapacity = capacity * 2;
    Object[] newArr = new Object[newCapacity];

    for (int i = 0; i < capacity; i++) {
      newArr[i] = arr[i];
    }

    arr = newArr;
    capacity = newCapacity;
  }

  @SuppressWarnings("unchecked")
  public T pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    T value = (T) arr[head];
    head--;
    return value;
  }

  @SuppressWarnings("unchecked")
  public T getHead() {
    if (isEmpty()) {
      return null;
    }
    return (T) arr[head];
  }

  public boolean isEmpty() {
    return head < 0;
  }
}
