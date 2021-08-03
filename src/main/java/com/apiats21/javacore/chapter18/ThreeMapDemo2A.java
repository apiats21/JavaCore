package main.java.com.apiats21.javacore.chapter18;
// Использовать метод thenComparing() для сортировки
// счетов вкладчиков сначала по фамилии, потом по имени.

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Компаратор, сравниваюший фамилии вкладчиков
class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        // найти индекс символа, с которого начонается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковые
class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i ,j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

public class ThreeMapDemo2A {
    public static void main(String[] args) {
        // Использовать метод thenComparing() для создания
        // компаратора, сравнивающего сначала фамилии, а затем
        // Ф.И.О. вкладчиков, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        //создать древовидное отображение
        TreeMap<String,Double> tm = new TreeMap<>(compLastThenFirst);
        // ввести элементы в древовидное отображение
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Беккер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        // получить множество элементов
        Set<Map.Entry<String,Double>> set = tm.entrySet();

        // вывести элементы из множества
        for(Map.Entry<String,Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println((me.getValue()));
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);

        System.out.println("Новый осаток на счету Дона Джоу: " +
                tm.get("Джон Доу"));











    }
}
