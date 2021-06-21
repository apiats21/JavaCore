package main.java.com.apiats21.javacore.chapter03;
// Вычесление среднего значения из массива
public class Average {
    public static void main(String[] args) {
        double num[] = { 10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for (i=0; i < 5; i++)
            result = result + num[i];
        System.out.println("Среднее значение равно " + result / 5);
    }
}
