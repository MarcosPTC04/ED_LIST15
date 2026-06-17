package dev.marcos.edlist15.core;

public class LinkedQueue<T> implements Queue<T> {

    private QueueNode<T> front;
    private QueueNode<T> rear;
    private int count;

    public LinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    @Override
    public void push(T element) {
        QueueNode<T> newNode = new QueueNode<>(element);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }

        count++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        T removed = front.getData();
        front = front.getNext();

        if (front == null) {
            rear = null;
        }

        count--;

        return removed;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return front.getData();
    }

    @Override
    public T back() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }

        return rear.getData();
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
        front = null;
        rear = null;
        count = 0;
    }
}