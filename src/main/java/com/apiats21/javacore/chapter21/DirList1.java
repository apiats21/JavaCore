package main.java.com.apiats21.javacore.chapter21;
// Вывести только те файлы из каталога,
// которые доступны для записи

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList1 {
    public static void main(String[] args) throws Exception{
        String dirname = "/new";

        // создать фильтр, возращающий логическое значение true
        // только в отношении доступных для записи файлов
        DirectoryStream.Filter<Path> how =
                new DirectoryStream.Filter<Path>() {
                    @Override
                    public boolean accept(Path filename) throws IOException {
                        if(Files.isWritable(filename)) return true;
                        return false;
                    }
                };

        // получить и использовать поток ввода из каталога
        // только доступных для записи файлов
        try (DirectoryStream<Path> dirstrm =
                Files.newDirectoryStream(Paths.get(dirname), how) )
        {
            System.out.println("Каталог " + dirname);

            for(Path entry:dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry, BasicFileAttributes.class);

                if(attribs.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.print("    ");
                System.out.println(entry.getName(1));
            }
        }
    }
}
