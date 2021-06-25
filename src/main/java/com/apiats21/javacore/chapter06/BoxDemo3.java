package main.java.com.apiats21.javacore.chapter06;
// В этой программе применяется метод, введеный в класс Box
class Box3 {
    double weigh;
    double height;
    double depth;

    // вывести обьем параллелипипеда
    void volume () {
        System.out.print("Обьем равен ");
        System.out.println(weigh * height * depth);
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3 ();
        Box3 mybox2 = new Box3 ();

        // присвоить значения переменным экзэмпляра mybox1
        mybox1.weigh = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экзэмпляра mybox2
        mybox2.weigh = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести обьем первого папаллелипипеда
        mybox1.volume();

        // вывести обьем второго параллелипипеда
        mybox2.volume();
    }
}
