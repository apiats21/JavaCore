package main.java.com.apiats21.javacore.chapter08;
// Полная реализация класса BoxWeight
class Box1 {
    private double widht;
    private double height;
    private double depth;

    // сконструировать клон обьекта
    Box1(Box1 ob) { // передать обьект конструктору
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box1(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсуствии размеров
    Box1() {
        widht = height = depth = -1; // значение -1 служит для обозначения
    }                                // неинициализированного параллелипипеда

    // конструктор, применяемый при создании куба
    Box1(double len) {
        widht = height = depth = len;
    }

    // расчитать и возратить обьем
    double volume(){
        return widht * height * depth;
    }
}
// теперь в классе BoxWeight реализованы все конструкторы
class BoxWeight1 extends Box1 {
    double weight; // вес параллелепипеда

    // сконструировать клон обьекта
    BoxWeight1 (BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight1 (double w, double h, double d, double m) {
        super (w, h, d);
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight1() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 mybox3 = new BoxWeight1(); // по умолчанию
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обьем mybox3 равен: " + vol);
        System.out.println("Вес mybox3 равен: " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обьем clone равен: " + vol);
        System.out.println("Вес myclone равен: " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обьем mycube равен: " + vol);
        System.out.println("Вес mycybe равен: " + mycube.weight);
        System.out.println();


    }
}
