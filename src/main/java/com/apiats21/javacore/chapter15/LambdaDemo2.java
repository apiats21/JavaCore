package main.java.com.apiats21.javacore.chapter15;
// Продемонстрировать применение лямбда-выражения,
// принемающего один параметр

// Еще один функциональный интерфейс
interface NumericTest {
    boolean test(int n);

}
public class LambdaDemo2 {
    public static void main(String[] args) {
        // Лямбда-выражение, проверяющее, является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if(isEven.test(10)) System.out.println("Число 10 четное");
        if(!isEven.test(9)) System.out.println("Число 9 нечетное");

        // А теперь воспользоваться лямбда-выражение, в котором
        // проверяется, является ли число отрецательным
        NumericTest isNegative = (n) -> (n > 0);
        if(isNegative.test(1)) System.out.println("Число 1 неотрицательное");
        if(!isNegative.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
