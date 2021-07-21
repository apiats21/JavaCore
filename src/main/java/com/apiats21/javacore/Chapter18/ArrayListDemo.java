package main.java.com.apiats21.javacore.Chapter18;

import java.util.ArrayList;

// Продемонстрировать применение класса ArrayList
public class ArrayListDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println("" +
                "Начальный размер списочного массива: " + a1.size());

        // Ввести элементы в списочный массив
        a1.add("C");
        a1.add("E");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("" +
                "Размер списочного массива после ввода элементов: " + a1.size());

        // Вывести списочный массив
        System.out.println("Содержание списочного массива a1: " + a1);

        // Удалить элементы из списочного массива
        a1.remove("F");
        a1.remove(2);

        System.out.println("" +
                "Размер списочного массива a1 после удаления: " + a1.size());

        System.out.println("Содержимое списочного массива a1: "+ a1);


    }

}
