package main.java.com.apiats21.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// продемонстрировать применение итераторов
public class IteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        //ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // использовать итераторы для вывода содержимого
        // списочноого массива al
        System.out.print("" +
                "Исходное содержимое списочного массива: ");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // видоизменить перебираемые обьекты
        ListIterator<String> list = al.listIterator();
        while (list.hasNext()) {
            String element = list.next();
            list.set(element + "+");
        }
        System.out.print("Измененное содержимое списочного массива a1: ");
        itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // А теперь отобразить список в обратном порядке
        System.out.print("Измененный в обратном порядке список: ");
        while(list.hasPrevious()) {
            String element = list.previous();
            System.out.print(element + " ");
        }


    }
}
