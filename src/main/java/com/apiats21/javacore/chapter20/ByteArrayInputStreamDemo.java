package main.java.com.apiats21.javacore.chapter20;

import java.io.ByteArrayInputStream;

// Продемонстрировать применение класса ByteArrayInputStream
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstvwxyz";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);

    }
}
