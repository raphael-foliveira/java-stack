package com.stack;

public class EmptyStackException extends Exception {
  EmptyStackException() {
    super("Stack is empty");
  }

  EmptyStackException(String message) {
    super(message);
  }
}