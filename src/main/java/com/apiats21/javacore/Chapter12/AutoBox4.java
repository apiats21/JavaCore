package main.java.com.apiats21.javacore.Chapter12;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.8;

        dOb = iOb + dOb;
        System.out.println("dOb после выражения: " + dOb);
    }
}
