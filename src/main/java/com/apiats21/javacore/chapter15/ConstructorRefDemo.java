package main.java.com.apiats21.javacore.chapter15;
// Продемострировать применение ссылки на конструкторы

// В функциональном интерфейсе MyFunc определяется метод,
// возращающий ссылку на класс myClass
interface MyFunc3 {
    MyClass3 func(int n);
}

class MyClass3 {
    private int val;

    // Этот конструктор принимает один аргумент
    MyClass3(int v) { val = v; }

    // А этот конструктор по умолчанию
    MyClass3() { val = 0; }

    // ..

    int getVal() { return val; }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass3.
        // Метод func() из интерфейса MyFunc3 принемает аргумент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса MyClass, а не к конструктору по умолчанию
        MyFunc3 myClassCons = MyClass3::new;

        // Создать экземпляр класса MyClass по ссылке на конструктор
        MyClass3 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
