package main.java.com.apiats21.javacore.chapter28;
// Простой пример блокировки

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread("A", lock);
        new LockThread("B", lock);

    }
}

// Общий ресурс
class Shared1 {
    static int count = 0;
}

// Поток исполнения, инкрементирующий значения счетчика
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            // сначала заблокировать счетчик
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счетчик");
            Shared1.count++;
            System.out.println("Поток " + name + ": " + Shared1.count);

            // а теперь переключение контекста, если это возможно
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(3000);
        } catch (InterruptedException e) { e.printStackTrace(); }
        finally {
            // снять блокировку
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
