package main.java.com.apiats21.javacore.chapter06;
/*  Программа используящая класс Box

    Присвоить исходному файлу имя BoxDemo.java
 */
class Box{
    int width;
    int height;
    int depth;
}
// В этом классе обьявляется обьект типа Box
public class BoxDemo {
    public static void main(String[] args) {


        Box mybox = new Box();
        double vol;
        //  присвоить значения переменным экзэмпляра класса
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать обьем парраллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Обьем равен " + vol);
    }
}
