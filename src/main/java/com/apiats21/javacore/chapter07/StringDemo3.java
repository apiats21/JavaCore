package main.java.com.apiats21.javacore.chapter07;
// Продемонстрировать применение массивов обьектов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for(int i=0; i<3; i++)
            System.out.println("Str[" + i + "]: " + str[i]);
    }
}
