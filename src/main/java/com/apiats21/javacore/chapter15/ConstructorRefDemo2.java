package main.java.com.apiats21.javacore.chapter15;
// Продемонстрировать применение ссылки на
// конструктор обобщенного класса

// Теперь функциональный интерфейс MyFunc обобщенный
interface MyFunc4<T>     {
    MyClass4<T> func(T n);
}

class MyClass4<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass4(T v) { val = v; }

    // А этот конструктор по умолчанию
    MyClass4() { val = null; }

    // ..
    T getVal() { return val; }
}


public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        // Создать ссылку на конструктор обобщенного класса MyClass4 <T>
        MyFunc4<Integer> myClassCons = MyClass4<Integer>::new;

        // создать экземпляр класса MyClass4<T>
        // по данной ссылке на конструктор
        MyClass4<Integer> mc = myClassCons.func(300);

        // Воспользоваться только что созданным
        // экземпляром класса MyClass4<T>
        System.out.println(
                "Значение val в объекте mc равно " + mc.getVal());
    }
}
