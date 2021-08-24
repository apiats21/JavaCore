package main.java.com.apiats21.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

// Продемонстрировать применение класса URL
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://HerbShield.com/Articles");

        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());

        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("полная форма: " + hp.toExternalForm());

    }
}
