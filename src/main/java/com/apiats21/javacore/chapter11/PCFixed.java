package main.java.com.apiats21.javacore.chapter11;
// Правильная реализация поставщика и потребителя
class Q1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InterruptedException перехвачено");
            }
        System.out.println("Получено:" + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InteruptedException перехвачено");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Отправлено: " + n);
         notify();
    }
}
class Producer1 implements Runnable {
    Q1 q;
    Thread t;

    Producer1(Q1 q) {
        this.q = q;
        t = new Thread(this, "Поставщик");
    }

    @Override
    public void run() {
        int i=0;

        while(true) {
            q.put(i++);
        }
    }
}
class Consumer1 implements Runnable {
    Q1 q;
    Thread t;
    Consumer1 (Q1 q) {
        this.q = q;
        t = new Thread(this, "Потребитель");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
public class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);

        p.t.start();
        c.t.start();
        System.out.println("Для остановки нажмите Ctr-C.");
    }
}
