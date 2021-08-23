package main.java.com.apiats21.javacore.chapter21;
// Использовать сопоставление для чтения данных из файла.
// Версия до JDK 7

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChanelRead1 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try {
            // сначала открыть файл для ввода
            fin = new FileInputStream("test.txt");

            // затем получить канал к этому файлу
            fChan = fin.getChannel();

            // получить размер файла
            fSize = fChan.size();

            // а теперь сопоставить файл с буфером
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);

            // читать байты с буфера и выводить их на экран
            for(int i=0; i<fSize; i++)
                System.out.print((char) mBuf.get());
        } catch (IOException e)
        {
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                if (fChan != null) fChan.close(); // закрыть канал
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия канала. " + e);
            }
            try {
                if(fin != null) fin.close(); // закрыть файл
            } catch (IOException e)
            {
                System.out.println("Ошибка закрытия файла. " + e);
            }
        }

    }
}
