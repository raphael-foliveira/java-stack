package com.lecture2;

import com.stack.EmptyStackException;

import com.stack.ArrayStack;
import com.stack.DynamicStack;
import com.stack.Stack;

public class Main {
    public static void main(String[] args) throws EmptyStackException {
        DynamicStack<String> stringDynamicStack = new DynamicStack<>();
        ArrayStack<String> stringArrayStack = new ArrayStack<>();
        runStringStackOperations(stringDynamicStack);
        runStringStackOperations(stringArrayStack);
    }

    private static void runStringStackOperations(Stack<String> stack) throws EmptyStackException {
        System.out.println("Runnin string stack operations");

        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("Pushing to stack...");

        stack.push("foo");
        System.out.println(stack.getHead());
        stack.push("bar");
        System.out.println(stack.getHead());
        stack.push("baz");
        System.out.println(stack.getHead());

        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("Popping from stack...");

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Finished");
    }
}