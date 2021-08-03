package main.java.com.apiats21.javacore.chapter18;
// Использовать список свойств по умолчанию

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();

        defList.setProperty("Флорида", "Тэлесси");
        defList.setProperty("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList);
        capitals.setProperty("Иллиноис", "Спрингфиелд");
        capitals.setProperty("Миссури", "Джеферсон-Сити");
        capitals.setProperty("Вашингтон", "Олимпия");
        capitals.setProperty("Калифорния", "Сакраменто");
        capitals.setProperty("Индиана", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // вывести все штаты и их столицы
        for(Object name : states) {
            System.out.println("Столица штата: " + name + " - " +
                    capitals.getProperty((String) name) + ".");
        }
        System.out.println();

        // Теперь штат Флорида будет найден в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - " + str + ".");
    }
}
