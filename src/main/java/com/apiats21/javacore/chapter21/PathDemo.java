package main.java.com.apiats21.javacore.chapter21;
// Получить сведения о пути к файлу в самом файле
// Требуется установка комплекта JDK, начиная с версии 7

import javax.print.attribute.Attribute;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("/new/test.txt");

        System.out.println("Имя файла: " + filepath.getFileName());
        System.out.println("Путь к файлу: " + filepath);
        System.out.println("Абсолютный путь к файлу: " +
                            filepath.toAbsolutePath());

        System.out.println(
                "Родительский каталог: " + filepath.getParent());
        if(Files.exists(filepath))
            System.out.println("Файл существует.");
        else
            System.out.println("Файл не существует.");
        try {
            if(Files.isHidden(filepath))
                System.out.println("Файл скрыт");
            else
                System.out.println("Файл не скрыт");
        } catch (IOException e)
        {
            System.out.println("Ошибка ввода-вывода" + e);
        }
        System.out.println(Files.isWritable(filepath));
        System.out.println("Файл доступен для записи");

        System.out.println(Files.isReadable(filepath));
        System.out.println("Файл доступен для чтения");

        try
        {
            BasicFileAttributes attribs =
                    Files.readAttributes(filepath, BasicFileAttributes.class);

            if(attribs.isDirectory())
                System.out.println("Это каталог");
            else
                System.out.println("Это не каталог");

            if(attribs.isRegularFile())
                System.out.println("Это обычный файл");
            else
                System.out.println("Это необычный файл");

            if(attribs.isSymbolicLink())
                System.out.println("Это символическая ссылка");
            else
                System.out.println("Это не символичвская ссылка");

            System.out.println("Время последней модификации файла:" +
                    attribs.lastModifiedTime());
            System.out.println("Размер файла " + attribs.size() + " байтов");
        } catch (IOException e)
        {
            System.out.println("Ошибка чтения атрибутов");
        }
    }
}
