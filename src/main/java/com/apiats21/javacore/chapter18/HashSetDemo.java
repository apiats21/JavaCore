package main.java.com.apiats21.javacore.chapter18;

import java.util.LinkedHashSet;

// Продемонстрировать применение класса HashSet
public class HashSetDemo {
    public static void main(String[] args) {
        // создать хэш множество
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // ввести элементы в хэш множество
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");
        hs.add("Бетта");


        System.out.println(hs);
    }
}
