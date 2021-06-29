package main.java.com.apiats21.javacore.chapter08;
// Применение абстрактных методов и классов
abstract class Figure1 {
    double dimm1;
    double dimm2;
    Figure1 (double a, double b) {
        dimm1 = a;
        dimm2 = b;
    }

    // теперь метод area() обьявляется абстрактным
    abstract double area();
}
class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a,b);
    }
    // переопределить метод area() для четырехугольника
    double area() {
        return dimm1 * dimm2;
    }
}
class Triange1 extends Figure1 {
    Triange1(double a, double b) {
        super(a, b);
    }
    double area () {
        return dimm1 * dimm2 / 2;
    }
}

public class AbstracrAreas {
    public static void main(String[] args) {
        //Figure1 f = new Figure1(10,10); // теперь недопустимо
        Rectangle1 r = new Rectangle1(9,5);
        Triange1 t = new Triange1(10,8);
        Figure1 figref; // верно, но обьект не создается

        figref = r;
        System.out.println("Площадь равна: " + figref.area());

        figref = t;
        System.out.println("Площадь равна: " + figref.area());
    }
}
