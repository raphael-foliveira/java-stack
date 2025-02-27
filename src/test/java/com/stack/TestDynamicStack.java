package com.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDynamicStack {
  @Test
  public void shouldPushAnIntegerToTheStack() {
    DynamicStack<Integer> stack = new DynamicStack<>();

    // stack must be empty and head must be null when initialized
    assertTrue(stack.isEmpty());
    assertNull(stack.getHead());

    stack.push(10);
    assertEquals(Integer.valueOf(10), stack.getHead());
  }

  @Test
  public void shouldPopAnIntegerFromTheStack() throws EmptyStackException {
    int expected = 10;
    DynamicStack<Integer> stack = new DynamicStack<>(expected);

    // stack must be populated since we passed an integer in the constructor
    assertFalse(stack.isEmpty());
    assertEquals(Integer.valueOf(expected), stack.getHead());

    int actual = stack.pop();
    assertEquals(expected, actual);
  }

  @Test
  public void shouldReturnTrueWhenCallingIsEmptyOnAnEmptyStack() {
    DynamicStack<Integer> stack = new DynamicStack<>();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void shouldReturnFalseWhenCallingIsEmptyOnANonEmptyStack() {
    DynamicStack<Integer> stack = new DynamicStack<>(10);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void shouldReturnNullWhenCallingGetHeadOnAnEmptyStack() {
    DynamicStack<Integer> stack = new DynamicStack<>();
    assertNull(stack.getHead());
  }

  @Test
  public void shouldReturnHeadValueWhenCallingGetHeadOnANonEmptyStack() {
    int expected = 10;
    DynamicStack<Integer> stack = new DynamicStack<>(expected);
    assertEquals(Integer.valueOf(expected), stack.getHead());
  }
}
