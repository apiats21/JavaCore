package main.java.com.apiats21.javacore.chapter28;

import java.util.concurrent.Phaser;

// Пример применения класса Phaser
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread2(phsr, "A");
        new MyThread2(phsr, "B");
        new MyThread2(phsr, "C");

        // ожидать исполнения всеми потоками первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать исполнения всеми потоками второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать исполнения всеми потоками третьей фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток с резистрации
        phsr.arriveAndDeregister();

        if(phsr.isTerminated())
            System.out.println("Синхронизатор фаз завершен");
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class MyThread2 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread2(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы

        // небольшая пауза, что бы не нарушить порядок вывода.
        // Только для иллюстрации, но не обязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(100);
        } catch (Exception e) { e.printStackTrace(); }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижение фазы

        // небольшая пауза, что бы не нарушить порядок вывода.
        // Только для иллюстрации, но не обязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(100);
        } catch (Exception e) { e.printStackTrace(); }

        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister(); // известить о достижении фазы и
                                    // снять потоки с регистрации

    }
}
