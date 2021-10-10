package main.java.com.apiats21.javacore.chapter28;
// Простой пример применения исполнителя

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        // запустить потоки исполнения
        es.execute(new MyThread4("A", cdl));
        es.execute(new MyThread4("B", cdl2));
        es.execute(new MyThread4("C", cdl3));
        es.execute(new MyThread4("D", cdl4));

        try {
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (Exception e) { e.printStackTrace(); }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}

class MyThread4 implements Runnable {
    String name;
    CountDownLatch latch;

    public MyThread4(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
