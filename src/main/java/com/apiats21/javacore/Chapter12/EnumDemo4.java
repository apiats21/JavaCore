package main.java.com.apiats21.javacore.Chapter12;
// Продемонстрировать применение методов ordinal(), compareTo(), equals()

enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        // получить все порядковые значения с помощью метода ordinal()

        for (Apple4 a : Apple4.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        // продемонстрировать применение методов compareTo() и equals()

        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " предшествует " + ap2);
        if(ap2.compareTo(ap) < 0)
            System.out.println(ap2 + " предшествует " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);

        System.out.println();

        if(ap.equals(ap2))
            System.out.println("Ошибка!");
        if(ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
