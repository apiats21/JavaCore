package main.java.com.apiats21.javacore.chapter05;
// Применение оператора break для выхода из цикла
public class Break {
    public static void main(String[] args) {
        for (int i =0; i<100; i++){
            System.out.println("i: " + i);
            if (i == 10) break;
        }
        System.out.println("Цикл завершен.");
    }
}
