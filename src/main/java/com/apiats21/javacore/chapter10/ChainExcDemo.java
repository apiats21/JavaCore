package main.java.com.apiats21.javacore.chapter10;
// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {

        NullPointerException e =
                new NullPointerException("верхний уровень");

        // добавить причину усключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение");

            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина:" + e.getCause());
        }
    }

    }
