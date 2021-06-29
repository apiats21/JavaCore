package main.java.com.apiats21.javacore.chapter08;
// Применение полиморфизма во время выполнения
class Figure {
    double dimm1;
    double dimm2;

    Figure (double a, double b) {
        dimm1 = a;
        dimm2 = b;
    }
    double area () {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle (double a, double b) {
        super(a,b);
    }
    // переопределить метод area() для четыреугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dimm1 * dimm2;
    }
}
class Triangle extends Figure {
    Triangle (double a, double b) {
        super(a,b);
    }

    // переопределить метод area() для прямоугольного треугольника
    double area() {
        System.out.println("В области прямоугольника");
        return dimm1 * dimm2 / 2;
    }
}
public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = f;
        System.out.println("Площадь равна " + figref.area());

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
