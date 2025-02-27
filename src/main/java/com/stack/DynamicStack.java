package com.stack;

public class DynamicStack<T> implements IStack<T> {
  private class StackItem {
    private T value;
    private StackItem next;

    public StackItem(T value) {
      this.value = value;
    }
  }

  private StackItem head;

  public DynamicStack() {
    head = null;
  }

  public DynamicStack(T headValue) {
    this.head = new StackItem(headValue);
  }

  public void push(T val) {
    StackItem stackItem = new StackItem(val);
    if (head == null) {
      head = stackItem;
      return;
    }
    stackItem.next = head;
    head = stackItem;
  }

  public T getHead() {
    if (head == null) {
      return null;
    }
    return head.value;
  }

  public T pop() throws EmptyStackException {
    if (head == null) {
      throw new EmptyStackException("Stack is empty");
    }
    StackItem popped = head;
    head = popped.next;
    return popped.value;
  }

  public boolean isEmpty() {
    return head == null;
  }
}
