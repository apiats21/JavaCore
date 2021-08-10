package main.java.com.apiats21.javacore.chapter15;
// Сгенерировать исключения из лямбда-выражения
interface DoubleNumericArrayFunction{
    double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст.");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException{
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // В этом лямбдо выражении вычисляется среднее числовых
        // значений типа double в массиве
        DoubleNumericArrayFunction average = (n) -> {
            double sum = 0;

            if(n.length==0)
                throw new EmptyArrayException();

            for(int i=0; i<n.length; i++)
                sum +=n[i];
            return sum / n.length;
        };
        System.out.println("Среднее равно: "+ average.func(values));

        // Эта строка приводит к генерации исключения
        System.out.println("Среднее равно: " + average.func(new double[0]));
    }
}
