package main.java.com.apiats21.javacore.chapter11;
// Создание нескольких потоков исполнения
class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for(int i=5; i>0; i--) {
                System.out.println( name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
public class MultipleThreadDemo {
    public static void main(String[] args) {
        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");

        try {
            // ожидать завершения работы других стеков
            Thread.sleep(2700);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
