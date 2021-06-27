package main.java.com.apiats21.javacore.chapter07;
// Продемонстрировать применение аргументов переменной длины
public class VarArgs {
    // теперь метод VarArgs обьявляется с аргументами переменной длины
    static void vaTest(int ...v) {
        System.out.print("Количество аргументов: " + v.length + " содержимое: ");
        for (int i=0; i<v.length; i++) System.out.print(v[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest с аргументами переменной длины
        vaTest(10);     // 1 аргумент
        vaTest(1,3,5);  // 3 аргумента
        vaTest();           // без аргументов
    }
}
