package main.java.com.apiats21.javacore.chapter06;
// В данном примере программы для инициализации размеров
// параллелипипеда в класе Box применяется конструктор
class Box6 {
    double width;
    double height;
    double depth;
    // Это конструктор класса Box6
    Box6 () {
        System.out.println("Конструктор обьекта Box ");
        width = 10;
        height = 10;
        depth = 10;
    }
    // рассчитать и возратить обьем
    double volume () {
        return width * height * depth;
    }

}
public class BoxDemo6 {
    public static void main(String[] args) {
        // обьявить, выделить память и инитиализировать обьекты типа Box6
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        // получить обьем первого параллелипипеда
        System.out.println("Обьем равен " + mybox1.volume());
        // получить обьем второго параллелипипеда
        System.out.println("Обьем равен " + mybox2.volume());

    }
}
