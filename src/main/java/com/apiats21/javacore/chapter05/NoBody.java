package main.java.com.apiats21.javacore.chapter05;
// Целая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        // расчитать среднее значение переменных i и j
        while (++i < --j); // у этого цикла отсуствует тело
        System.out.println("Среднее значение равно " + i);
    }
}
