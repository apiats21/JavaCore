package main.java.com.apiats21.javacore.chapter08;
// Динамическая диспетчеризация методов
class A6 {
    void callme() {
        System.out.println("В методе callme из класса A");
    }
}

class B6 extends A6 {
    // переопределить метод callme
    void callme () {
        System.out.println("В методе callme из класса B");
    }
}

class C6 extends B6 {
    // переопределить метод callme
    void callme() {
        System.out.println("В методе callme из класса C");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6(); // Обьект класса A
        B6 b = new B6(); // Обьект класса B
        C6 c = new C6(); // Обьект класса C

        A6 r;        // Получить ссылку на обьект типа A

        r = a;       // переменная r ссылается на обьект a
        r.callme();  // вызвать вариант метода callme,
                     // определенный в классе A
        r = b;       // переменная r ссылается на обьект b
        r.callme();  // вызвать вариант метода callme,
                     // определинный в классе B
        r = c;       // переменная r ссылается на обьект ц
        r.callme();  // вызвать вариант метода callme,
                     // определенного в классе C

    }
}
