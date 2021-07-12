package main.java.com.apiats21.javacore.chapter11;
// Приостановка и возобновление исполнения потока современным способом
class NewThread4 implements Runnable {
    String name; // има потока
    Thread t;
    boolean suspendFlag;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения

    @Override
    public void run() {
        try {
            for(int i=15; i>0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("Один");
        NewThread4 ob2 = new NewThread4("Два");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока Один.");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Приостановка потока Два.");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Два.");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
