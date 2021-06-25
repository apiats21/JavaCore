package main.java.com.apiats21.javacore.chapter06;
// Теперь метод volume возвращает обьем параллелипипеда
class Box4 {
    double width;
    double height;
    double depth;

    // расчитать и возратить обьем
    double volume () {
        return width * height * depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4 ();
        Box4 mybox2 = new Box4 ();
        double vol;

        // присвоить значения переменным экзэмпляра mybox1
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;

        /* присвоить значения переменным экзэмпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить обьем первого параллелипипеда
        vol = mybox1.volume();
        System.out.println("Обьем равен: " + vol);

        // получить обьем второго параллелипипеда
        vol = mybox2.volume();
        System.out.println("Обьем равен: " + vol);

    }
}
