package main.java.com.apiats21.javacore.chapter29;
// Отобразить один поток данных на другой

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        // список числовых значений типа double
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Отобразить квадратные корни из списка myList
        // на новый поток данных

        Stream<Double> sqrRootStrm =
                myList.stream().map((a-> Math.sqrt(a)));

        // получить произведение квадратных корней
        double productOfSqrRoot = sqrRootStrm.reduce(1.0,(a,b) -> a * b);

        System.out.println(
                "Произведение квадратных корней равно: " + productOfSqrRoot);
    }
}
