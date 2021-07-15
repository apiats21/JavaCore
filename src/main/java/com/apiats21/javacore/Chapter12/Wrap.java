package main.java.com.apiats21.javacore.Chapter12;
// Продемонстрировать оболочку числового типа
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb); // выводит значения 100 и 100
    }
}
