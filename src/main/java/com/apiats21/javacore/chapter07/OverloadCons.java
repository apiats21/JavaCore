package main.java.com.apiats21.javacore.chapter07;
/* в данном примере конструкторы определяются в классе Box
   для инициализации размеров параллелипипеда тремя разными способами
 */
class Box {
    double wight;
    double height;
    double depth;

    // конструктор, используемый при указании всех параметров
    Box (double weight, double height, double depth) {
        this.wight = weight;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, используемык когда ни один параметр не указан
    Box () {
        wight = -1;     // использовать значение -1
        height = -1;    // для не инициализированного
        depth = -1;     // параллелипипеда
    }

    // конструктор, используемый при создании куба
    Box (double len) {
    wight = height = depth = len;
    }

    // расчитать и возратитиь обьем
    double volume() {
        return wight * height * depth;
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        // получить обьем первого параллелипипеда
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);

        // получить обьем второго параллелипипеда
        System.out.println("Обьем mybox2 равен " + mybox2.volume());

        // получить обьем третьего параллелипипеда
        System.out.println("Обьем mybox3 равен " + mybox3.volume());
    }
}
