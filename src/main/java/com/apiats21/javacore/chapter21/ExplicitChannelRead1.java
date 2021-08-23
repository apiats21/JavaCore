package main.java.com.apiats21.javacore.chapter21;
// Боллее компактный способ открытия канала
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead1 {
    public static void main(String[] args)  throws IOException {
        int count;

        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Paths.get("test.txt")) )
        {
            ByteBuffer mBuf = ByteBuffer.allocate(3);

            do {
                count = fChan.read(mBuf);

                if(count != -1) {
                    mBuf.rewind();
                    for(int i=0; i< count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
        }
    }
}
