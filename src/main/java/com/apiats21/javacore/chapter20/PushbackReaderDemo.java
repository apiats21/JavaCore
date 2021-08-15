package main.java.com.apiats21.javacore.chapter20;
// Продемонстрировать применение метода unread()
// из класса PushbackInputStream.
// В этой прогамме применяется оператор try с ресурсами
// Требуется установка комплекта JDK, с ресурсами.

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        char[] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        CharArrayReader in = new CharArrayReader(buf);

        int c;

        try (PushbackReader f = new PushbackReader(in))
        {
            while((c = f.read()) != -1) {
                switch (c) {
                    case'=':
                        if((c = f.read()) == '=')
                            System.out.print(".eq.");
                        else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
