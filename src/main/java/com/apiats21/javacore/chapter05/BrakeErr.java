package main.java.com.apiats21.javacore.chapter05;
// Эта программа содержит ошибку
public class BrakeErr {
    public static void main(String[] args) {
        one: for (int i=0; i<3; i++) {
            System.out.println("проход " + i + ": ");
        }
        for (int j=0; j<100; j++) {
            if (j == 10) break; // one; // ОШИБКА!
            System.out.println( j + " ");
        }
    }
}
