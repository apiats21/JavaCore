package main.java.com.apiats21.javacore.chapter10;
// Продемонстрировать применение оператора throw
public class ThrowDemo {
    static void depoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            depoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: "  + e);
        }
    }
}
