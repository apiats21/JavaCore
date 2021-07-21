package main.java.com.apiats21.javacore.Chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

// Продемонстрировать простое применение интерфейса Spliterator
public class SpliteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив типа double
        ArrayList<Double> vals = new ArrayList<>();

        // ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // вызвать метод tryAdvance() для вывода содержимого
        // списочного массива vals
        System.out.println("Содержимое списочного массива val:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // создать новый списочный массив, содержащий квадратные
        // корни числовых значений из списочного массива vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));

        // вызвать медот forEachRemaining() для вывода содержимого
        // списочного массива sqrt
        System.out.print("содержимое списочного массива sqrt:\n");
        spltitr = sqrt.spliterator();
        spltitr.forEachRemaining((n)-> System.out.println(n));
        System.out.println();





    }
}
