package dev.marcos.edlist15.exercises;

import dev.marcos.edlist15.core.MyQueue;

public class Exercise2 {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Fila usando duas pilhas:");
        System.out.println("Frente: " + queue.peek());
        System.out.println("Fim: " + queue.back());

        System.out.println("\nRemovendo elementos:");

        while (!queue.isEmpty()) {
            System.out.println("Removido: " + queue.pop());
        }
    }
}