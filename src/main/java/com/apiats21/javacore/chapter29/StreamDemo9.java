package main.java.com.apiats21.javacore.chapter29;

// Применить итератор-разделитель в потоке данных

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {

        // создать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        // получить поток данных для списочного массива
        Stream<String> mySteam = myList.stream();

        // получить итератор разделитель
        Spliterator<String> splitItr = mySteam.spliterator();

        // Перебрать элементы в потоке данных
        while(splitItr.tryAdvance((n) -> System.out.println(n)));
    }
}
