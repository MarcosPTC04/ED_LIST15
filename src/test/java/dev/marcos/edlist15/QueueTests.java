package dev.marcos.edlist15;

import dev.marcos.edlist15.core.LinkedQueue;
import dev.marcos.edlist15.core.MyQueue;
import dev.marcos.edlist15.core.StaticQueue;

public class QueueTests {

    public static void main(String[] args) {

        System.out.println("===== TESTE STATIC QUEUE =====");

        StaticQueue<Integer> staticQueue = new StaticQueue<>(10);

        staticQueue.push(10);
        staticQueue.push(20);
        staticQueue.push(30);

        System.out.println("Frente: " + staticQueue.peek());
        System.out.println("Fim: " + staticQueue.back());

        System.out.println("Pop: " + staticQueue.pop());
        System.out.println("Pop: " + staticQueue.pop());

        staticQueue.push(40);

        System.out.println("Tamanho: " + staticQueue.size());

        System.out.println();

        System.out.println("===== TESTE LINKED QUEUE =====");

        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.push("A");
        linkedQueue.push("B");
        linkedQueue.push("C");

        System.out.println("Frente: " + linkedQueue.peek());
        System.out.println("Fim: " + linkedQueue.back());

        System.out.println("Pop: " + linkedQueue.pop());
        System.out.println("Pop: " + linkedQueue.pop());

        System.out.println("Tamanho: " + linkedQueue.size());

        System.out.println();

        System.out.println("===== TESTE MYQUEUE =====");

        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.push(100);
        myQueue.push(200);
        myQueue.push(300);

        System.out.println("Frente: " + myQueue.peek());
        System.out.println("Fim: " + myQueue.back());

        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());

        System.out.println("Tamanho: " + myQueue.size());

        System.out.println();

        System.out.println("===== TESTE POPBACK =====");

        StaticQueue<Integer> dequeQueue = new StaticQueue<>(10);

        dequeQueue.push(1);
        dequeQueue.push(2);
        dequeQueue.push(3);
        dequeQueue.push(4);

        System.out.println("PopBack: " + dequeQueue.popBack());
        System.out.println("PopBack: " + dequeQueue.popBack());

        System.out.println("Tamanho: " + dequeQueue.size());
    }
}