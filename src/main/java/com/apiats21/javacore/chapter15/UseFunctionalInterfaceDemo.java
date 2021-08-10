package main.java.com.apiats21.javacore.chapter15;
// Использовать встроенный функциональный интерфейс Function

import java.util.function.Function;

public class UseFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычесляет факториал
        // целочисленного значения. Для этой цели на сей раз
        // используется функциональный интерфейс Function
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result *= i;
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.apply(3));
        System.out.println("Факториал числа 5 равен " + factorial.apply(5));
    }
}
