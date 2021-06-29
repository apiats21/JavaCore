package main.java.com.apiats21.javacore.chapter08;
// Рассширение класса BoxWeight путем включения в него
// поля для доставки

// Создать сначала класс Box
class Box2 {
    private double width;
    private double length;
    private double depth;

    // сконструировать клон обьекта
    Box2(Box2 ob) {
        width = ob.width;
        length = ob.length;
        depth = ob.depth;
    }

    // конструктор применяемый при указании всех параметров
    Box2(double width, double length, double depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    // конструктор приминяемый при отсуствии параметров
    Box2() {
        width = length = depth = -1; // значение -1 слувит для обозначения
    }                             // не инициализированного параллелипиеда

    // конструктор, применяемый при создании куба
    Box2(double len) {
        width = length = depth = len;
    }

    // рассчитать и возратить обьем
    double vol() {
        return width * length * depth;
    }
}

// Добавить поле веса
class BoxWeight3 extends Box2 {
    double weight;

    // Сконструировать клон обьекта
    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight3(double width, double length, double depth, double weight) {
        super(width, length, depth);
        this.weight = weight;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight3() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}
// добавить поле стоимости доставки
class Shipments extends BoxWeight3 {
        double cost;

        // сконструировать клон обьекта
    Shipments (Shipments ob) {
        super(ob);
        cost = ob.cost;
    }

    // конструктор, применяемый при указании всех параментров
    Shipments (double w, double l, double d, double m, double c) {
        super(w, l, d, m);
        cost = c;
    }

    // конструктор, применяемый по умолчанию
    Shipments() {
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipments (double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}


public class DemoShipment {
    public static void main(String[] args) {
        Shipments shipment1 = new Shipments(10, 20, 15, 10, 3.41);
        Shipments shipment2 = new Shipments(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.vol();
        System.out.println("Обьем shipment1 равен: " + vol);
        System.out.println("Вес shipments1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);


        vol = shipment2.vol();
        System.out.println("Обьем shipment2 равен: " + vol);
        System.out.println("Вес shipments2 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);

    }
}
