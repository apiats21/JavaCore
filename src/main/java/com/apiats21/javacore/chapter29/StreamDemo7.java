package main.java.com.apiats21.javacore.chapter29;
// Использовать метод collect() для создания списка типа List
// и множества типа Set из потока данных

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail1(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class PhoneName1 {
    String phonenum;
    String name;

    public PhoneName1(String name, String phonenum) {
        this.phonenum = phonenum;
        this.name = name;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {

        // Исписок имен, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Лари", "555-5555","Larry@HerbShield.com"));
        myList.add(new NamePhoneEmail1("Джеймс", "555-4444","James@HerbShield.com"));
        myList.add(new NamePhoneEmail1("Мэри", "555-3333","Mary@HerbShield.com"));

        // отобразить только имена и номера телефонов на новый поток данных
        Stream<PhoneName1> nameAndPhone = myList.stream().map(
                (a) -> new PhoneName1(a.name, a.phonenum) );

        // вызвать метод collect() что бы составить список типа List
        // из имен и телефонов
        List<PhoneName1> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке toList: ");
        for(PhoneName1 e: npList)
            System.out.println(e.name + ": " + e.phonenum);

        // получить другое отображение имен и номеров телефонов
        nameAndPhone = myList.stream().map((a) -> new PhoneName1(a.name, a.phonenum));

        // а теперь создать множество типа Set, вызвав метод collect()
        Set<PhoneName1> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Имена и номера телефонов в множестве типа Set:");
        for(PhoneName1 s:npSet)
            System.out.println(s.name + " " + s.phonenum);


    }
}
