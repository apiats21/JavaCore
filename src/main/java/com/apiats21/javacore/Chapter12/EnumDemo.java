package main.java.com.apiats21.javacore.Chapter12;
// Перечисление сортов яблок
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        // вывести значение перечислемого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // Сравнить значения перечисленного типа
        if (ap==Apple.GoldenDel)
            System.out.println("Переменная ap содержит GoldenDel\n");

        // пременить перечисления для оператора with

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый");
                break;
            case RedDel:
                System.out.println("Сорт Reddel красный");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный");
                break;
            case Cortland:
                System.out.println("Сорт Cortland желтый");
        }
    }
}
