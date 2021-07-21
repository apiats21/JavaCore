package main.java.com.apiats21.javacore.Chapter18;

import java.util.Enumeration;
import java.util.Hashtable;

// Продемострировать применение класса Hashtable
public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String,Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        Double bls;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Беккер", 1378.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        // показать все счета в хеш-таблице
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        // внести сумму 1000 на счет Джона Доу
        bls = balance.get("Джон Доу");
        balance.put("Джон Доу", bls + 1000);
        System.out.println("Новый остаток на счете Джон Доу: " + balance.get("Джон Доу"));








    }
}
