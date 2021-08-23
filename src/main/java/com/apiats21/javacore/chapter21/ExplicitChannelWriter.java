package main.java.com.apiats21.javacore.chapter21;
// Записать данные в файл средствами системы ввода-вывода NIO.
// Требуется установка комплекта JDK, начиная с версии 7

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWriter {
    public static void main(String[] args) {

        // получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE) )
        {
            // создать буфер
            ByteBuffer mBuf = ByteBuffer.allocate(2);


            for(int j=0; j<3; j++) {
                // записать некоторое количество байт в буфер
                for (int i = 0; i < 26; i++)
                    mBuf.put((byte) ('A' + i));

                // подготовить буфер к записи данных
                mBuf.rewind();

                // записать данные из буфера в выходной файл
                fChan.write(mBuf);

                mBuf.put((byte) 121);

            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
