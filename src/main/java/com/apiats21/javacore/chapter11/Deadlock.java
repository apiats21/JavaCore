package main.java.com.apiats21.javacore.chapter11;
// Пример взаимной блокировки
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name +  " Вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Класс A прерван");
        }
        System.out.println(name + " Пытается вызвать метод B.last");
        b.last();
    }
    synchronized void last() {
        System.out.println("В методе B.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Класс B прерван");
        }
        System.out.println(name + " пытается вызвать метод a.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничаший поток");
        t.start();

        a.foo(b);   // Получить блокировку для обьекта a
                    // в этом потоке исполнения
        System.out.println("Назад в главный поток.");
    }

    public void run() {
        b.bar(a);   // Получить блокировку для обьекта b
                    // в этом потоке исполнения
        System.out.println("Назад в другой поток.");
    }

    public static void main(String[] args) {
        new Deadlock();
    }







}
