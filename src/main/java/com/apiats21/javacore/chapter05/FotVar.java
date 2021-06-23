package main.java.com.apiats21.javacore.chapter05;
// Отдельные части оператора цикла for могут отсуствовать
public class FotVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;

        for (; !done;) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
