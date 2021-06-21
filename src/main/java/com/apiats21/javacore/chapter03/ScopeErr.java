package main.java.com.apiats21.javacore.chapter03;
// Скомпилировать эту программу нельза
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {                   // создается новая область действия
          //  int bar = 2;    // Ошибка во время компеляции -
        }                   // переменная bar уже определена!

    }
}
