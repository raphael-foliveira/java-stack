package com.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayStack {
  @Test
  public void shouldPushAnIntegerToTheStack() {
    ArrayStack<Integer> stack = new ArrayStack<>();

    // stack must be empty and head must be null when initialized
    assertTrue(stack.isEmpty());
    assertNull(stack.getHead());

    stack.push(10);
    assertEquals(Integer.valueOf(10), stack.getHead());
  }

  @Test
  public void shouldPopAnIntegerFromTheStack() throws EmptyStackException {
    int expected = 10;
    ArrayStack<Integer> stack = new ArrayStack<>(expected);

    // stack must be populated since we passed an integer in the constructor
    assertFalse(stack.isEmpty());
    assertEquals(Integer.valueOf(expected), stack.getHead());

    int actual = stack.pop();
    assertEquals(expected, actual);
  }

  @Test
  public void shouldReturnTrueWhenCallingIsEmptyOnAnEmptyStack() {
    ArrayStack<Integer> stack = new ArrayStack<>();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void shouldReturnFalseWhenCallingIsEmptyOnANonEmptyStack() {
    ArrayStack<Integer> stack = new ArrayStack<>(10);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void shouldReturnNullWhenCallingGetHeadOnAnEmptyStack() {
    ArrayStack<Integer> stack = new ArrayStack<>();
    assertNull(stack.getHead());
  }

  @Test
  public void shouldReturnHeadValueWhenCallingGetHeadOnANonEmptyStack() {
    int expected = 10;
    ArrayStack<Integer> stack = new ArrayStack<>(expected);
    assertEquals(Integer.valueOf(expected), stack.getHead());
  }
}
