package main.java.com.apiats21.javacore.chapter07;
// Продемонстрировать статические переменные, методы и блоки кода
public class UseStatic {
    static int a =3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован.");
        b= a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
