package main.java.com.apiats21.javacore.chapter07;
// Использовать массив для передачи методу переменного
// количества аргументов. Это старый подхо к обработке
// аргументов переменной длины
public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Количество аргументов: " + v.length +
                            " Содержимое: ");
        for (int x:v)
            System.out.print(x + " ");
            System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на порядок создания массива
        // для храниния аргументов

        int n1[] = { 10 };
        int n2[] = {1, 2, 3};
        int n3[] = { };

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);

    }
}
