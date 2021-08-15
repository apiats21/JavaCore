package main.java.com.apiats21.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть внесены в массив";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte[] b = f.toByteArray();
        for(int i=0; i<b.length; i++) System.out.print((char) b[i]);

        System.out.println("\nВ поток вывода типа  OutputStream\n");

        // использовать оператор try с ресурсами для управления
        // потоком ввода-вывода

        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
            return;
        }

        System.out.println("Установка в исходнее состояние");
        f.reset();

        for(int i=0; i<3;i++) f.write('X');
        System.out.println(f.toString());


    }
}
