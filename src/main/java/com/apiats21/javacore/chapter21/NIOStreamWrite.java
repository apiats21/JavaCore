package main.java.com.apiats21.javacore.chapter21;
// Продемонстрировать потоковый вывод на основе системы NIO.
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) throws Exception {

        // открыть файл и получить связный с ним поток вывода
        try (OutputStream fout =
                new BufferedOutputStream(
                        Files.newOutputStream(Paths.get("test.txt")))  )
        {
            // вывести в поток заданное количество байтов
            for(int i=0; i<26; i++)
                fout.write((byte) ('A' + i));

        }
    }
}
