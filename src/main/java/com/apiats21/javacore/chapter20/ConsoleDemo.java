package main.java.com.apiats21.javacore.chapter20;
// Продемонстрировать применение класса Console

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        System.out.println("Error");


        // получить ссылку на консоль
        con = System.console();

        // выйти из программы, если консоль не доступна
        if(con == null) {
            return;
        }

        // прочитать строку и вывести ее
        str = con.readLine("Введите строку: ");
        con.printf("Введенная вами строка %s\n", str);
    }
}
