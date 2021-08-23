package main.java.com.apiats21.javacore.chapter21;
// Вывести содержимое каталога. Требуется установка комплекта JDK,
// начиная с версии 7

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/new";

        // Получить и обработать поток ввода каталога
        // в блоке оператора try
        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Paths.get(dirname),"*{File*,Demo*}.{java,class}"))
        {
            System.out.println("каталог: " + dirname);
            // Класс DirectoryStream реализует интерфейс Iterable,
            // поэтому для вывода содержимого каталога можно
            // организовать цикл for с стиле for each.

            for(Path entry:dirstrm) {
                BasicFileAttributes attrbts =
                        Files.readAttributes(entry,BasicFileAttributes.class);
                if(attrbts.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.print("    ");

                System.out.println(entry.getName(1));
            }

        } catch (Exception e)
        {
            e.fillInStackTrace();
        }

    }
}
