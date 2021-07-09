package main.java.com.apiats21.javacore.chapter10;
// Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a=10, b=0;
        int vals[] = {1,2,3};

        try {
            int result = a / b; // Сгенерировать исключения
                                // типа ArithmeticException
            vals[10] = 13;      // Сгенерировать исключения
                                // типа ArrayIndexOutOfBoundException
                // В этом операторе catch перехватываются оба исключения
        }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Исключение перехвачено.");
            }
        System.out.println("После многократного перехвата.");
    }
}
