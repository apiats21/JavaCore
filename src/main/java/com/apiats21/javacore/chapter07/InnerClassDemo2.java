package main.java.com.apiats21.javacore.chapter07;
//  Эта программа не подлежит компиляции
class Outer1 {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутренний класс
class Inner {
        int y = 10; // локальная переменная класса Inner

        void display() {
            System.out.println("Вывод outer_x = " + outer_x);
        }
    }
    void showy() {
       // System.out.println(y); // ошибка, здесь переменная
                               // y недоступна
    }

}
public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
