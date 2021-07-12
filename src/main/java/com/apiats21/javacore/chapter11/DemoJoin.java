package main.java.com.apiats21.javacore.chapter11;
//  Применить метод join() чтобы ожидать завершиния потоков исполнения
class NewThread2 implements Runnable {
    String name; // Имя потока исполнения
    Thread t;

    NewThread2(String threadname) {
        name  = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить новый поток
    }

    // точка входа в поток исполнения

    public void run() {
        try {
            for (int i=5; i>0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " Завершен");
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread2 obj1 = new NewThread2("Один");
        NewThread2 obj2 = new NewThread2("Два");
        NewThread2 obj3 = new NewThread2("Три");

        System.out.println("Поток Один запущен: " + obj1.t.isAlive());
        System.out.println("Поток Два запущен: " + obj2.t.isAlive());
        System.out.println("Поток Трии запущен: " + obj3.t.isAlive());

        // ожидать заверщения потоков исполнения
        try {
            System.out.println("Ожидаем завершения потоков.");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток Один запущен: " + obj1.t.isAlive());
        System.out.println("Поток Два запущен: " + obj2.t.isAlive());
        System.out.println("Поток Три запущен: " + obj3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }
}
