package main.java.com.apiats21.javacore.chapter21;
// Записать данные в сопоставляемый файл
// Требуется установка комплекта JDK, начиная с версии 7

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) throws Exception {
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.READ,
                        StandardOpenOption.CREATE) )
        {
            // затем сопоставить файл с буфером
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // записать заданное количество байт в буфер
            for (int i=0; i<26; i++)
                mBuf.put((byte) ('A' + i));
        }
    }
}
