package main.java.com.apiats21.javacore.chapter10;
/* Эта программа содержит ошибку.

    В последовательности операторов catch подкласс исключений
    долвен быть указан перед его суперклассом, иначе это приведет
    к недостежимому коду и ошибке во время компиляции.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
//          catch (ArithmeticException e) { // ОШИБКА: Недостежимый код!
//              System.out.println("Этот код вообще не достежим.");
//          }

    }
}
