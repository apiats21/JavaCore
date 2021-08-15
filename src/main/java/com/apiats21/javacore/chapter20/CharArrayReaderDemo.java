package main.java.com.apiats21.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

// Продемонстрировать пременение класса CharArrayReader.
// В этой программе используется оператор try с ресурсами
// Требуется установка комплекта JDK, начиная с версии 7
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmonpoqrstvwxyz";
        int length = tmp.length();
        char[] c = new char[length];
        tmp.getChars(0,length, c,0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c))
        {
            System.out.println("input1:");
            while((i=input1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода");
        }

        try (CharArrayReader input2 = new CharArrayReader(c,0,5))
        {
            System.out.println("\ninput2:");
            while ((i= input2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
