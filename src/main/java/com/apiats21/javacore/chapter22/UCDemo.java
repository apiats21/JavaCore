package main.java.com.apiats21.javacore.chapter22;
// Продемонстрировать применение класса URLConnection

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("https://www.kufar.by/");
        URLConnection hpCon = hp.openConnection();

        // получить дату
        long d = hpCon.getDate();
        if(d == 0)
            System.out.println("Сведения о дате отсуствуют");
        else
            System.out.println("Дата " + new Date(d));

        // получить тип содержимого
        System.out.println(
                "Тип содержимого: " + hpCon.getContentType());

        // получить дату срока действия ресурса
        d = hpCon.getExpiration();
        if(d==0)
            System.out.println("Сведения о сроке действия отсуствуют");
        else
            System.out.println(
                    "Срок действия истекает" + new Date(d));

        // получить дату последней модификации
        d = hpCon.getLastModified();
        if(d==0)
            System.out.println("Сведения о дате последней модификации");
        else
            System.out.println(
                    "Дата последней модификаации: " + new Date(d));

        // получить длину содержимого
        long len = hpCon.getContentLengthLong();
        if(len == -1)
            System.out.println("Длина содержимого недоступна.");
        else
            System.out.println("Длина содержимого: " + len);

        if(len !=0) {
            System.out.println("===Содержимое===");
            InputStream input = hpCon.getInputStream();
            while((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else
            System.out.println("Содержимое недоступно");
    }
}
