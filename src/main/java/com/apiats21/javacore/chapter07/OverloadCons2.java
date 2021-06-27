package main.java.com.apiats21.javacore.chapter07;
// В этой версии класса Box один обьект допускается
// инициализировать другим обьектом
class Box2 {
    double width;
    double height;
    double depth;

    // Обратитте внимание на этот конструктор.
    // В качестве параметра в нем используется обьект типа Box
    Box2 (Box2 ob) { // передать обьект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Box2 (double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, используемый если ни один параметр не указан
    Box2 () {
        width = height = depth = -1; // использовать значение -1 для
                                     // неинициализованного параллелипипеда
    }

    // конструктор, используемый при создании куба
    Box2 (double len) {
        width = height = depth = len;
    }

    // рассчитать и возратить обьем
    double vol () {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // Создать параллелипипеды, используя
        // разные конструкторы
        Box2 mybox1 = new Box2(10,20,15);
        Box2 mybox2 = new Box2();
        Box2 mybox3 = new Box2(7);

        Box2 myclone = new Box2(mybox1);
        // создать копию обьекта mybox1

        double volume;

        // получить обьем первого параллелипипеда
        volume = mybox1.vol();
        System.out.println("Обьем mybox1 равен " + volume);

        // получить обьем второго параллелипипеда
        volume = mybox2.vol();
        System.out.println("Обьем mybox2 равен " + volume);

        // получить обьем куба
        System.out.println("Обьем mybox3 равен " + mybox3.vol());

        // получить обьем клона
        System.out.println("Обьем Myclone равен " + myclone.vol());
    }
}
