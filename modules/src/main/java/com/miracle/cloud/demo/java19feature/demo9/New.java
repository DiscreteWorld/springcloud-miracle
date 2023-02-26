package com.miracle.cloud.demo.java19feature.demo9;

import java.util.stream.IntStream;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  15:43
 * @Version 1.0
 */
public class New {
    static int THREADS_NO = 100_000;
    public static void main(String[] args) {
        IntStream.range(0, THREADS_NO)
                .forEach(i -> Thread.ofVirtual().start(new Task()));
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
