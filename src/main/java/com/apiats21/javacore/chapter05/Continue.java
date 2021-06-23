package main.java.com.apiats21.javacore.chapter05;
//  Продемонстрировать пременение оператора continue
public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }
}
