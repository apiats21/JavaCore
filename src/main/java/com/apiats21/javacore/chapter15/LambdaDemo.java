package main.java.com.apiats21.javacore.chapter15;
// Продемонстрировать применение простого лямбда-выражения

// Функциональный интерфейс
interface MyNumber{
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // обьявить ссылку на функциональный интерфейс

        // Здесь лямбда-выражение прото является константным выражением.
        // Когда оно присвевается ссылочной переменной myNum, получается
        // экземпляр класса, в котором лямбда-выражение реализует
        // метод getValue() из функционального интерфейса MyNumber
        myNum = () -> 123.45;

        // вызвать метод getValue(), представляемый
        // присвоеным ранее лямбда-выражением
        System.out.println("Фиксированное значение: " + myNum.getValue());

        // А здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;

        // В следующих строках кода вызывается лямбда-выражение
        // из предыдущей строки кода
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println(
                    "Еще одно случайное значение: " + myNum.getValue());

        // Лямбда-выражение должно быть совместимо с абстрактным методом,
        // определяемым в функциональном интерфейсе. Поэтому следующая
        // строка кода ошибочна:
        // myNum = () -> "123.45"; // ОШИБКА!!!


    }
}