package main.java.com.apiats21.javacore.chapter03;

// Вычеслить площадь круга
public class Area {
    public static void main(String[] args) {


        double p, r, a;

        r = 10.8; // радиус окружности
        p = 3.1416; // приблизительное значение числа пи
        a = p * r * r; // площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
