package main.java.com.apiats21.javacore.chapter18;

import java.util.LinkedList;

// Продемонстрировать применение класса LinkedLists.
public class LinkedListDemo {
    public static void main(String[] args) {
        // создать связной список
        LinkedList<String> ll = new LinkedList<String>();

        //ввести элементы в связной список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");

        System.out.println("Исходное содержимое связного списка: " + ll);

        // удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного списка ll" +
                "после удаления элементов" + ll);

        // удалить первый и последний элемент из связного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка ll " +
        " после удаления первого и последнего элемента" + ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое связного списка ll " +
                "после изменения: " + ll);





    }
}
