package main.java.com.apiats21.javacore.Chapter12;
// Автоупаковка/распаковка происходит в выражениях
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb1, iOb2;
        int i;

        iOb1 = 100;
        System.out.println("Исходнее значение iOb1: " + iOb1);

        // В следующем выражении автоматичесли расспаковывается
        // обьект iOb1, выполняется приращение получаемого значения,
        // которое затем обратно упаковывается в обьект iOb1;
        ++iOb1;
        System.out.println("После ++iOb1: " + iOb1);

        // Здесь обьект iOb1 расспаковывается, выражение вычисляется
        // а результат снова упаковывается и присваивается обьекту iOb2
        iOb2 = iOb1 - (iOb1 / 3);
        System.out.println("iOb2 после выражения: " + iOb2);

        // Здесь вычисляется тоже самое выражение,
        // но результат не запаковывается
        i = iOb1 - (iOb1 / 3);
        System.out.println("i после выражения: " + i);
    }
}
