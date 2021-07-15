package main.java.com.apiats21.javacore.Chapter12;
// Автоупаковка/ автораспаковка происходит при передаче
// параметров и возрате значений из методов

public class AutoBox2 {
    // принять параметр типа integer и возвратить
    // значение типа int
    static int m(Integer v) {
        return  v;
    }

    // Передать значение типа int методу int m() и присвоить
    // возращаемое значение обьекту типа Integer.
    // Здесь значение 100 аргумента автоматически
    // упаковывается в обьект типа Integer.
    // Возращаемое значение также упаковывается в обьект
    // типа Integer.

    public static void main(String[] args) {

        Integer iOb = m(100);

        System.out.println(iOb);
    }
}
