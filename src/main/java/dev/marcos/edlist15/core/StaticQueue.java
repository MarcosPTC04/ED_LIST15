package dev.marcos.edlist15.core;

@SuppressWarnings("unchecked")
public class StaticQueue<T> implements Queue<T> {

    private T[] items;
    private int count;

    public StaticQueue(int capacity) {
        items = (T[]) new Object[capacity];
        count = 0;
    }

    @Override
    public void push(T element) {
        if (count == items.length) {
            throw new RuntimeException("Fila cheia.");
        }

        items[count] = element;
        count++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        T removed = items[0];

        for (int i = 1; i < count; i++) {
            items[i - 1] = items[i];
        }

        items[count - 1] = null;
        count--;

        return removed;
    }

    public T popBack() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        T removed = items[count - 1];
        items[count - 1] = null;
        count--;

        return removed;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return items[0];
    }

    @Override
    public T back() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return items[count - 1];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            items[i] = null;
        }

        count = 0;
    }
}