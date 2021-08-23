package main.java.com.apiats21.javacore.chapter21;
// Использовать каналы для чтения данных из файла.
// Версия до JDK 7.

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try {
            // сначала открыть файл для ввода
            fIn = new FileInputStream("test.txt");

            // затем получить канал к этому файлу
            fChan = fIn.getChannel();

            // выделить оперативную память под буфер
            mBuf = ByteBuffer.allocate(128);

            do{
                // читать данные в буфер
                count = fChan.read(mBuf);

                // прекратить чтение по достижении конца файла
                if(count != -1) {
                    // подготовить буфер для чтения из него данных
                    mBuf.rewind();

                    // читать данные из буфера и
                    // выводить их на экран как символы
                    for(int i=0; i<count; i++)
                        System.out.println((char) mBuf.get());
                }
            } while (count != -1);
        } catch (IOException e)
        {
            System.out.println("I/O Exception" + e);
        } finally {
            try {
                if (fChan != null) fChan.close(); // Закрыть канал
            } catch (IOException e )
            {
                System.out.println("Ошибка закрытия канала" + e);
            }
            try {
                if(fIn != null) fIn.close(); // закрыть файл
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия файла" + e);
            }
        }
    }
}
