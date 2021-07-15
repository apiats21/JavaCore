package main.java.com.apiats21.javacore.Chapter12;
// Автоупаковка/распаковка значений из классов Boolean и Character
public class AutoBox5 {
    public static void main(String[] args) {
        // Автоупаковка/распаковка значения типа boolean
        Boolean b = true;

        // Обьект автоматически распаковывается,
        // когда он употребляется в операторе if
        if(b) System.out.println("b равно true");

        // Автоупаковка/распаковка значений типа char
        Character ch ='x'; // упаковать значение типа char
        char ch2 = ch; // распаковать значение типа char

        System.out.println("ch2 равно: " + ch2);
    }
}
