package main.java.com.apiats21.javacore.chapter08;
// Переопределение методов
class A4 {
    int i, j;
    A4(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show () {
        System.out.println("i и j: " + i +  " " + j);
    }
}
class B4 extends A4 {
    int k;
    B4(int a, int b, int c) {
        super(a,b);
        k = c;
    }
    // Вывести содержимое поременной k, с помощью метода
    // переопределяющего метод show класса А
    void show () {
        super.show();
        System.out.println("к: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B4 subOb = new B4(1,2,3);
        subOb.show(); // здесь вызывается метод show из класса B
    }
}
