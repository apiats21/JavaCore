package main.java.com.apiats21.javacore.chapter10;
// Продемонстрировать примененое оператора finally
public class FinallyDemo {
    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("" +
                    "Блок оператора finally в методе procA()");
        }
    }

    // возратить управление из блока try
    static void procB() {
        try {
            System.out.println("В теле метода ProcB()");
            return;
        } finally {
            System.out.println("" +
                    "Блок оператора finally в методе procB()");
        }
    }

    //выполнить блок try как обычно
    static void procC() {
        try {
            System.out.println("В теле метода procC()");
    } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
        }

    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
