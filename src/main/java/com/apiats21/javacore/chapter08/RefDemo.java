package main.java.com.apiats21.javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Обьем weightbox равен: " + vol);
        System.out.println("Вес weightbox равен: " + weightbox.weight);
        System.out.println();

        // Присвоить ссылке на обьект BoxWeight ссылки на обьект Box
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, так как метод volume
                                 // определен в классе Box

        /*
        Следующий оператор ошибочен, поскольку член plainbox
        не определяет weightbox. */
        // System.out.println("Вес plainbox равен:" + plainbox.weight);
    }
}
