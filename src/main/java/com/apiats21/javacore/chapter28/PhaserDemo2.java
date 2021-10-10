package main.java.com.apiats21.javacore.chapter28;
// Расширить класс Phaser и переопределить метод onAdvance()
// таким образом, что бы было выполнено только определенное
// количество фаз

import java.util.concurrent.Phaser;

// Расширить класс MyPhaser, чтобы выполнить только
// определенное количество фаз
class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    // переопределить метод onAdvance(), чтобы выполнить
    //определенное количество фаз

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        // следующий оператор println() требуется только для
        // целей иллюстрации. Как правило, метод onAdvance()
        // не отображает выводимые данные
        System.out.println("Фаза " + phase + " завершена.\n");

        // возратить логическое значение true,
        // если все фазы завершены
        if(phase == numPhases || registeredParties == 0) return true;

        // в противном случае возратить логическое знчение false
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        //ожидать завершения определенного количество фаз
        while(!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Синхронизатор фаз завершен");
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread3(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(!phsr.isTerminated()) {
            System.out.println(
                    "Поток " + name + " начинает фазу " + phsr.getPhase());

            // Небольшая пауза, чтобы не нарушить порядок вывода.
            // Только для иллюстрации, но не обязательно для правильного
            // функционирования синхронизатор фаз
            try {
                Thread.sleep(1000);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}
