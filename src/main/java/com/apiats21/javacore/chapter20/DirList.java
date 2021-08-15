package main.java.com.apiats21.javacore.chapter20;

import java.io.*;

// Использовать каталоги
public class DirList {
    public static void main(String[] args) {
        String dirname = "c:/program files";
        File f1 = new File(dirname);
        if(f1.isDirectory()) {
            System.out.println("каталог " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                        if(f.isDirectory())
                            System.out.println(s[i] + " является каталогом");
                        else
                            System.out.println(s[i] + " не является каталогом");
            }
        } else System.out.println(dirname + " не является каталогом");
    }
}
