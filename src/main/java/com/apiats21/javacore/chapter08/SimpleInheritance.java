package main.java.com.apiats21.javacore.chapter08;
// Простой пример наследования
// Создать суперкласс
class A {
    int i,j;

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса A
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // супер класс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое обьекта superOb: ");
        superOb.showij();
        System.out.println();

        /* подкласс имеет доступ ко всем открытым членам
           своего суперкласса. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое обьекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.print("Сумма i, j и к в обьекте subOb: ");
        subOb.sum();
    }
}
