package Chapter_18;

import java.util.Stack;

public class ReverseStackWithHelper_7 {

	// reverse stack 'stack' using 'helper'
    public static <T> void reverseStack(Stack<T> stack, Stack<T> helper) {
        if (stack.isEmpty()) {
            return;
        }

        // Pop top element
        T top = stack.pop();

        // Recursively reverse the remaining stack
        reverseStack(stack, helper);

        // Move all elements from stack to helper
        while (!stack.isEmpty()) {
            helper.push(stack.pop());
        }

        // Push top at bottom
        stack.push(top);

        // Move back from helper to stack
        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Stack<Integer> helper = new Stack<>();

        System.out.println("Original stack: " + stack);
        reverseStack(stack, helper);
        System.out.println("Reversed stack: " + stack);
    }
    // queue is a adt
}
