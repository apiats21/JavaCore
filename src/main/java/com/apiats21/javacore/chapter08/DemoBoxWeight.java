package main.java.com.apiats21.javacore.chapter08;
// В этой программе наследование применяется
// для расширения класса Box
class Box {
    double width;
    double height;
    double depth;

    // сконстуировать клон оьекта
    Box(Box ob) { // Передать клон конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех обьектов
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсуствии размеров
    Box () {
        width = height = depth = -1; // значение -1 служит дляобозначения
    }                                // неинициализированного параллелипипеда


    // конструктор, используемый при создании куба
    Box (double len) {
        width = height = depth = len;
    }

    //  расчитать и возратить обьем
    double volume() {
        return width * height * depth;
    }
}
// Расширить класс Box включив в него поле веса
class BoxWeight extends Box {
    double weight; // вес параллелипипеда

    // конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 30.4);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен:" + vol);
        System.out.println("Вес mybox1 равен:" + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
    }
}
