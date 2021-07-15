package main.java.com.apiats21.javacore.Chapter12;
// Воспользоватся встроенными в перечисления методами
enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечисленного типа Apple:");

        //  применить метод values
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);

        System.out.println();

        // Применить метод value()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит: " + ap);
    }
}
