package main.java.com.apiats21.javacore.chapter21;
// Простой пример применения метода walkFileThree()
// для вывода дерева каталогов. Требуется установка
// комплекта JDK, начиная с версии 7

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// Создать специальную версию класса SimpleFileVisitor,
// в которой переопределяется метод visitFile()
class MyFileVisitor extends SimpleFileVisitor<Path> {

     public FileVisitResult visitFile(
            Path path, BasicFileAttributes attribs)
            throws IOException
     {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {

        String dirname = "/games";

        System.out.println("Дерево каталогов, наачиная с каталога " +
                dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
