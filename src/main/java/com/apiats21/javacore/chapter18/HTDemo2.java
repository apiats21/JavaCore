package main.java.com.apiats21.javacore.chapter18;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Применить итераторы вместе с Hashtable
public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String,Double> balance = new Hashtable<>();

        String str;
        Double bls;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Беккер", 1378.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        // Вывести все счета в хеш-таблице. Сначала получить
        // представления всех ключей в виде множества.
        Set<String> set = balance.keySet();

        // получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Внести сумму 1000 на счет Джон Доу
        bls = balance.get("Джон Доу");
        balance.put("Джон Доу", bls + 1000);
        System.out.println("Новый остаток на счете Джон Доу: " +
                balance.get("Джон Доу"));



    }
}
