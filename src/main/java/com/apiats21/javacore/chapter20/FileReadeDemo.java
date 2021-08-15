package main.java.com.apiats21.javacore.chapter20;
// Продемонстрировать применение класса FileReader
// В этой программе используется оператор try с ресурсами.
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.FileReader;
import java.io.IOException;

public class FileReadeDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("google.html"))
        {
            int c;

            // прочитать и вывести содержимое файла
            while (((c=fr.read()) != -1)) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
