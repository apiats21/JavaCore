package main.java.com.apiats21.javacore.chapter21;
// Использовать сопоставление для чтения данных из файла.
// Требуется установка комплекта JDK, начиная с версии 7

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {

        // получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Paths.get("test.txt")) )
        {

            // получить размер файла
            long fSize = fChan.size();

            // а теперь сопоставить файл с буфером
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);

            // читать файлы из буфера и выводить из на экран
            for(int i=0; i<fSize; i++)
                System.out.print((char) mBuf.get());

            System.out.println();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
