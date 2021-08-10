package main.java.com.apiats21.javacore.chapter15;
// Использовать ссылку на метод, чтобы найти
// максимальное значение в коллекции

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private int val;

    MyClass(int v) {val = v; }

    int getVal() { return val; }
}

public class UseMethodRef {
    // Метод compare(), совместивый с аналогичным методом,
    // определенным в интерфейсе Comparator <T>
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass>a1 = new ArrayList<>();

        a1.add(new MyClass(1));
        a1.add(new MyClass(4));
        a1.add(new MyClass(2));
        a1.add(new MyClass(9));
        a1.add(new MyClass(3));
        a1.add(new MyClass(7));

        // найти максимальное значение, используя метод compareMC()
        MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);

        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}
