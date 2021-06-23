package main.java.com.apiats21.javacore.chapter05;
// Применение оператора brake  во вложенном цикле
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i =0; i<3; i++){
            System.out.print("Проход " + i +": ");
            for (int j=0; i<100; j++){
                if (j==10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
