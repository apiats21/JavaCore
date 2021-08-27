package main.java.com.apiats21.javacore.chapter29;
// Применить итератор в потоке данных

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {

        // созадать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бетта");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        // получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();

        // получить итератор для потока данных
        Iterator<String> itr = myStream.iterator();

        // беребрать элементы в потоке данных
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
