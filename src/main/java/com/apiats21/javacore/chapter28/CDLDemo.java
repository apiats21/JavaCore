package main.java.com.apiats21.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

// Продемонстрировать применение класса CountDownLatch
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(2);

        System.out.println("Запуск потока исполнения");

        new MyThread(cdl);

        try {
            cdl.await();
        } catch (Exception e) { e.printStackTrace(); }
        System.out.println("Заверщение потока исполнения");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "    ");
            System.out.println(latch.getCount());
            latch.countDown(); // Обратный отсчет
        }
    }
}
