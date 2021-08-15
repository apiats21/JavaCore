package main.java.com.apiats21.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

// Продемонстрировать применение класса FileOutputStream.
// Для закрытия файла в этой программе применяется оператор
// try с ресурсами. Требуется установка комплекта JDK,
// начиная с версии 7
public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                        " to come to the aid of their country\n" +
                        " and pay their due taxes";
        byte buf[] = source.getBytes();

        // применить оператор try с ресурсами для закрытия файлов
        try (FileOutputStream f0 = new FileOutputStream("file4.txt");
             FileOutputStream f1 = new FileOutputStream("file5.txt");
             FileOutputStream f2 = new FileOutputStream("file6.txt") )
        {
            // записать данные в первый файл
            for(int i=0; i< buf.length; i+=2) f0.write(buf[i]);

            // записать данные во второй файл
            f1.write(buf);

            // записать данные в третий файл
            f2.write(buf, buf.length - buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

    }
}
