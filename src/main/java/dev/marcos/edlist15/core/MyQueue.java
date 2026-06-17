package dev.marcos.edlist15.core;

import java.util.Stack;

public class MyQueue<T> implements Queue<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    @Override
    public void push(T element) {
        stack1.push(element);
    }

    private void transfer() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    @Override
    public T pop() {
        transfer();

        if (stack2.isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return stack2.pop();
    }

    @Override
    public T peek() {
        transfer();

        if (stack2.isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return stack2.peek();
    }

    @Override
    public T back() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }

        if (!stack2.isEmpty()) {
            return stack2.firstElement();
        }

        throw new RuntimeException("Fila vazia.");
    }

    @Override
    public int size() {
        return stack1.size() + stack2.size();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public void clear() {
        stack1.clear();
        stack2.clear();
    }
}
