package ru.rtech.interview.task3;

import java.util.Queue;

public class Consumer implements Runnable {

    // Общая очередь
    private final Queue<Double> sharedQueue;

    public Consumer(Queue<Double> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Implemented it!");
    }

    private Double consume() throws InterruptedException {
        throw new UnsupportedOperationException("Implemented it!");
    }
}
