package main.java.com.apiats21.javacore.chapter06;
// В этой программе применяется метод с параметрами
class Box5 {
    double width;
    double height;
    double depth;

    // установить размеры параллелипипида
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // расчитать и возратить обьем
    double volume () {
        return width * height * depth;
    }


}
public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        // Инициализировать каждый экзэмпляр класса Box5
        mybox1.setDim(15, 20, 10);
        mybox2.setDim(3, 6, 9);

        // получить обьем первого паралелипипеда
        System.out.println("Обьем равен " + mybox1.volume());

        // получить обьем второго паралеллипипеда
        System.out.println("Обьем равен " + mybox2.volume());
    }
}
