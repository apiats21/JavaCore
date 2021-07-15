package main.java.com.apiats21.javacore.Chapter12;
// Использовать конструктор, переменныю экзэмпляра и метод в перечислении
enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // цена яблока для каждого сорта

    // конструктор
    Apple2(int p) { price = p; }

    int getPrice() { return price; }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;

        // вывести цену на яблоки сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит: " +
                Apple2.Winesap.getPrice() + " центов.");

        // вывести цены на все сорта яблок
        for(Apple2 a : Apple2.values()) {
            System.out.println("Яблоко сорта " + a + " стоит " + a.getPrice() + " центов");
        }
    }
}
