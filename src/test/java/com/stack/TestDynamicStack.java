package com.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDynamicStack {
  private DynamicStack<Integer> stack;

  @Before
  public void setUp() {
    stack = new DynamicStack<>();
  }

  @Test
  public void shouldStartWithAnEmptyStack() {
    assertTrue(stack.isEmpty());
    assertNull(stack.getHead());
  }

  @Test
  public void shouldPushAndGetHead() {
    stack.push(10);
    assertFalse(stack.isEmpty());
    assertEquals(Integer.valueOf(10), stack.getHead());
  }

  @Test
  public void shouldPopAnElement() throws EmptyStackException {
    stack.push(10);
    assertEquals(Integer.valueOf(10), stack.pop());
    assertTrue(stack.isEmpty());
  }

  @Test
  public void shouldPushAndPopMultipleItems() throws EmptyStackException {
    pushItems(stack, 10);

    for (int i = 9; i >= 0; i--) {
      assertEquals(Integer.valueOf(i), stack.pop());
    }

    assertTrue(stack.isEmpty());
  }

  @Test
  public void shouldReturnNullForGetHeadOnEmptyStack() {
    assertNull(stack.getHead());
  }

  @Test
  public void shouldReturnTrueForIsEmptyOnNewStack() {
    assertTrue(stack.isEmpty());
  }

  @Test
  public void shouldReturnFalseForIsEmptyOnNonEmptyStack() {
    stack.push(10);
    assertFalse(stack.isEmpty());
  }

  // Helper method to push multiple items
  private void pushItems(DynamicStack<Integer> stack, int count) {
    for (int i = 0; i < count; i++) {
      stack.push(i);
    }
  }
}
