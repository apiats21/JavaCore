package main.java.com.apiats21.javacore.chapter28;
// Простой пример применения семафора

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

// Общий ресуср
class Shared {
    static int count = 0;
}

// поток исполнения, ужеличивающий значения счетчика на 1
class IncThread implements Runnable {
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {

            // сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешение");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            // а теперь получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count );

                // разрешить, если можно переключение контента
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}
// Поток исполнения, уменьшающий значения щетчика на 1
class DecThread implements Runnable{
    String name;
    Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this, "B").start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // Сначала получить разрешенние
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");

            // а теперь полчить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                // разрешить, если можно, переключение контекста
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}