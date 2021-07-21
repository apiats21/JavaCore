package main.java.com.apiats21.javacore.Chapter18;

import java.util.TreeSet;

// Продемонстрировать пприменение класса TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        // Ввести элементы в древовидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println(ts.subSet("A","E"));
    }
}
