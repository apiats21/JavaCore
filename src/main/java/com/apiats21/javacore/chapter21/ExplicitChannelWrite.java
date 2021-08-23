package main.java.com.apiats21.javacore.chapter21;
// Записать данные в файл средствами ввода-вывода NIO.
// Версия до JDK 7.

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        FileOutputStream fOut =  null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {
            // сначала открыть файл для ввода данных
            fOut = new FileOutputStream("test.txt");

            // затем получить канал к файлу для вывода данных
            fChan = fOut.getChannel();

            // создать буфер
            mBuf = ByteBuffer.allocate(26);

            // записать некоторое количество байтов в буфер
            for(int i=0; i<26; i++)
                mBuf.put((byte)('A' + i));

            // подготовить буфер к записи данных
            mBuf.rewind();

            // записать данные из буфера в выходной файл
            fChan.write(mBuf);
        } catch (IOException e)
        {
            System.out.println("Ошибка ввода-вывода" + e);
        } finally {
            try {
                if(fOut != null) fOut.close(); // закрытие потока
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия потока");
            }
            try {
                if(fChan != null) fChan.close(); // закрытие файла
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия файла");
            }
        }
        {
            System.out.println();
        }
    }
}
