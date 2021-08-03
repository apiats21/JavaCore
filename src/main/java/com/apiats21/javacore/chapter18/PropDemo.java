package main.java.com.apiats21.javacore.chapter18;
// продемонстриривать применение списка свойств

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллиноис", "Спрингфиелд");
        capitals.put("Миссури", "Джеферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // показать все штаты и их столицы
        for(Object name : states)
            System.out.println("Столица штата: " + name + " - " + capitals.getProperty((String)name) + ".");
        System.out.println();

        // найти штат, отсусствующий в списке, указав значения,
        // выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");


    }
}
