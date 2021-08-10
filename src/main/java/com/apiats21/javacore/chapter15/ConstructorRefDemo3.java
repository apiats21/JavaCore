package main.java.com.apiats21.javacore.chapter15;
// Реализовать простую фабрику классов, используя ссылку на конструктор

interface MyFunc5<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass5<T> {
    private T val;

    // Конструктор, принимающий один параметр
    MyClass5(T v) { val = v; }

    // Конструктор по умолчанию. Этот конструктор в
    // данной программе не используется.
    MyClass5() { val = null; }
    //...

    T getVal() {return val; }
}

// Простой, не обобщенный класс
class MyClass6 {
    String str;

    // Конструктор, принимающий один аргумент
    MyClass6 (String s) {str = s; }

    // Конструктор по умолчанию. Этот конструктор в
    // данной прграмме не используется.
    MyClass6 () { str = ""; }

    //...

    String getVal() { return str; }
}

public class ConstructorRefDemo3 {

    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа T. А пораметр R
    // обозначает тип создаваемого объекта.
    static <R,T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass.
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFunc5<MyClass5<Double>, Double> myClassCons = MyClass5<Double>::new;

        // Создать экземпляр типа класса MyClass, используя фабричный метод
        MyClass5<Double> mc = myClassFactory(myClassCons, 100.1);

        // Использовать только что созданный экземпляр класса MyClass5
        System.out.println(
                "Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса,
        // используя метод myClassFactory()
        MyFunc5<MyClass6, String> myClassCons2 = MyClass6::new;

        // Создать экземпляр класса MyClass6, используя фабричный метод
        MyClass6 mc2 = myClassFactory(myClassCons2, "Лямбда");

        // использовать только что созданный экземпляр класса MyClass5
        System.out.println(
                "Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
