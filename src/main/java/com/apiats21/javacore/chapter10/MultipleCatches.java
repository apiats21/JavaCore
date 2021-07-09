package main.java.com.apiats21.javacore.chapter10;
// Продемонстрировать применение нескольких операторов catch.
public class MultipleCatches {
    public static void main(String[] args) {
        try {

            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
          catch ( ArrayIndexOutOfBoundsException e) {
              System.out.println(" Ошибка индексации за пределами массива:" + e);
          }
        System.out.println("После блоков операторов try/catch.");
    }
}
