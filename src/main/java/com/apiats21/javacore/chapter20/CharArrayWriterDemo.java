package main.java.com.apiats21.javacore.chapter20;
// Продемонстрировать применение класса CharArrayWriter.
// В этой программе используется оператор try  с ресурсами.
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть введены в массив";
        char buff[] = new char[s.length()];
        s.getChars(0,s.length(),buff,0);

        try {
            f.write(buff);
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода");
            return;
        }

        System.out.println("Буфер в ввиде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        char[] c = f.toCharArray();
        for(int i:c)
            System.out.print((char) i);

        System.out.println("\nВ поток вывода типа FileWriter");

        // использовать оператор try с ресурсами для управления
        // потоком ввода-вывода в файл
        try (FileWriter f2 = new FileWriter("test.txt"))
        {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
        System.out.println("Установка в исходное состояние");
       // f.reset();

        for (int i=0; i<3; i++)
            f.write('X');

        System.out.println(f.toString());




    }
}
