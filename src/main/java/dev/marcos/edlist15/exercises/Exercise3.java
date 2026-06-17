package dev.marcos.edlist15.exercises;

import dev.marcos.edlist15.core.StaticQueue;

public class Exercise3 {

    public static void main(String[] args) {

        StaticQueue<Integer> queue = new StaticQueue<>(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Fila:");
        System.out.println("Frente: " + queue.peek());
        System.out.println("Fim: " + queue.back());

        System.out.println("\nRemovendo pelo final:");

        while (!queue.isEmpty()) {
            System.out.println("Removido: " + queue.popBack());
        }
    }
}