package main.java.com.apiats21.javacore.chapter28;
// Продемонстрировать применение класса CyclicBarrier

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск готов");

        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");
        new MyThread1(cb, "X");
        new MyThread1(cb, "Y");
        new MyThread1(cb, "Z");
    }
}

// Поток исполнения, использующий барьер типа CyclicBarrier

class MyThread1 implements Runnable {
    CyclicBarrier cbar;
    String name;

    public MyThread1(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cbar.await();
        } catch (Exception e) { e.printStackTrace(); }
    }
}

// Объект этого класса вызывается по достижении
// баръера типа CyclicBarrier

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}