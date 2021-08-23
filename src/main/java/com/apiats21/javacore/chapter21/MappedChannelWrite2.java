package main.java.com.apiats21.javacore.chapter21;
// Записать данные в сопоставленный файл. Версия до JDK 7.

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelWrite2 {
    public static void main(String[] args) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {
            fOut = new RandomAccessFile("test.txt","rw");

            // получить канал к открытому файлу
            fChan = fOut.getChannel();

            // затем сопоставить файл с буфером
            mBuf = fChan.map(FileChannel.MapMode.READ_WRITE,0,26);

            // записать некоторое количество байтов в буфер
            for(int i=0; i<26; i++)
                mBuf.put((byte)('A'+ i));
        } catch (IOException e)
        {
            System.out.println("Ошибка ввода вывода" + e);
        } finally {
            try {
                if(fChan != null) fChan.close(); // закрыть канал
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия канала" + e);
            }
            try {
                if(fOut != null) fOut.close(); // закрыть файл
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия файла" + e);
            }
        }
    }
}
