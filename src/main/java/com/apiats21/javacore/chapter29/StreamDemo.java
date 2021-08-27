package main.java.com.apiats21.javacore.chapter29;
// Продемонстрировать несколько потоковых операций

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // создать списочный массив значений типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();

        // получить минимальное и максимальное значение, вызвав
        // методы min(), max(), isPresent(), get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) System.out.println(
                "Минимальное значение: " + minVal.get() );

        // непремено получить новый поток данных, поскольку
        // предыдущий вызов метода min() стал оконченой операцией,
        // употребивший поток данных
        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if(maxValue.isPresent()) System.out.println(
                "Максимальное значение: " + maxValue.get() );

        // отсортировать поток данных, вызвав метод sorted()
        Stream<Integer> sortedStream = myList.stream().sorted();
        // отобразить отсортированный поток данных, вызвав метод forEach()
        System.out.print("Отсортированный поток данных: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // вывести только нечетные целочисленные значения,
        // вызвав метод filter()
        Stream<Integer> oddValues = myList.stream().filter((n) -> (n % 2) == 1);
        System.out.print("Нечетные значения:");
        oddValues.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        // вывести только те нечотные целочисленные значения,
        // которые больше 5. Обратите внимание на конвееризацию
        // обеих операций фильтрации.
        oddValues = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.print("Нечетные значения больше 5: ");
        oddValues.forEach((n) -> System.out.print(n + " "));


    }
}
