package main.java.com.apiats21.javacore.chapter11;
// Создать второй поток исполнения, расширив класс Thread
class NewThread1 extends Thread {
    NewThread1() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток исполнения
    }
    // Точка входа во второй поток исполнения
    public void run() {
            try {
                for(int i=5; i>0; i--) {
                    System.out.println("Дочерний поток: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
        System.out.println("Дочерний поток завершен.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread1(); // создать новый поток исполнения

        try {
            for (int i=5; i>0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
