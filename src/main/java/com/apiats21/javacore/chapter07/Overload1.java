package main.java.com.apiats21.javacore.chapter07;
class OverloadDemo1 {
    void test() {
        System.out.println("Параметры отсуствуют");
    }
    // перегруваемый метод, проверяющий наличие
    // двух целочисленных значений
    void test (int a, int b) {
        System.out.println("а и  b: " + a + " " + b);
    }

    // перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test (double a) {
        System.out.println(
          "Внутреннее преобразование при вызове test(double) a: " + a);
    }
}
public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);             // здесь вызывается вариант метода test(double)
        ob.test(123.25);     // а здесь вызывается вариант метода test(double)
    }
}
