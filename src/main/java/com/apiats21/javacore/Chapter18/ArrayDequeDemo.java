package main.java.com.apiats21.javacore.Chapter18;

import java.util.ArrayDeque;

// Продемонстрировать применение класса ArrayDeque
public class ArrayDequeDemo {
    public static void main(String[] args) {
        //создать двухстороннею очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Исвлечение из стека:");

        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();




    }
}
