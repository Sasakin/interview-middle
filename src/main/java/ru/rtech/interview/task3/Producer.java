package ru.rtech.interview.task3;

import java.util.Queue;

public class Producer implements Runnable {

    // Общая очередь
    private final Queue<Double> sharedQueue;
    // Максимальный размер
    private final int SIZE;

    // Конструктор
    public Producer(Queue<Double> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Implemented it!");
    }

    private double produce() throws InterruptedException {
        throw new UnsupportedOperationException("Implemented it!");
    }
}
