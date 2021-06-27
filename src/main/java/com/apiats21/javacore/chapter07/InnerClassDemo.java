package main.java.com.apiats21.javacore.chapter07;
// Продемонстрировать применение внутреннего класса
class Outer {
    int outer_x =100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

class Inner {
        void display() {
            System.out.println("вывод outer_x = " + outer_x);
        }
}
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
    }
}
