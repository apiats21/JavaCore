package main.java.com.apiats21.javacore.chapter28;
// Простой пример выполнения атомарных операций

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class Shared2 {
    static AtomicInteger ai = new AtomicInteger(0);
}

// Поток исполнения, в котором инкрементируется значение счетчика
class  AtomicThread implements Runnable {
    String name;

    public AtomicThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Поток " + name + " получено " + Shared2.ai.getAndSet(i));
        }
    }
}