package main.java.com.apiats21.javacore.chapter11;
// Создать второй поток исполнения
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // создать второй поток исполнения
        t = new Thread(this, "Демостративный поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }
    // точка входа во второй поток исполнения
    public void run() {
        try {
            for(int i=5; i>0;i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Главнык поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
