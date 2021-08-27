package main.java.com.apiats21.javacore.chapter29;
// Применить метод map() для создания нового потока данных
// содержащего только избранные элементы из исходнего списка

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {

        // список имен, телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри","555-5555","Larry@HerbShield.com"));
        myList.add(new NamePhoneEmail("Джеймс","555-4444","James@HerbShield.com"));
        myList.add(new NamePhoneEmail("Мэри","555-3333","Mary@HerbShield.com"));

        System.out.println("Исходние элементы из списка myList: ");
        myList.stream().forEach((a)-> { System.out.print(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        // отобразить на новый поток данных
        // только имена и номера телефонов
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum) );

        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phonenum));
    }
}
