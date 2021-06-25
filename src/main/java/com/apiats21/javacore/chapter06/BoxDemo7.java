package main.java.com.apiats21.javacore.chapter06;
/*  В данном примере примере для инициализации размеров
    параллелипипеда в классе Box применяется параметризированный
    конструктор
 */
class Box7 {
    double width;
    double height;
    double depth;
    // это конструктор класса Box7
    Box7 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возратить обьем
    double volume () {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        // Обьявить, выделить память и инициализировать обьекты класс Box7
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // получить обьем первого параллелипипеда
        vol = mybox1.volume();
        System.out.println("Обьем равен " + vol);

        // получить обьем второго параллелипипеда
        vol = mybox2.volume();
        System.out.println("Обьем равен " + vol);
    }
}
