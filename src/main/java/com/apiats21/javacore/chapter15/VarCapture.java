package main.java.com.apiats21.javacore.chapter15;
// Пример захвата локальной переменной из объемлющей области действия
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        // Локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Такое применение переменной n допустимо, поскольку
            // она не видоизменяется
            int v = num + n;

            // но следующая строка не допустима, поскольку в ней
            // предпренимается попытка видоизменить значение переменной num
            // num++;

            return v;
        };
        System.out.println(myLambda.func(52));

        // и следующая строка кода приведет к ошибке, поскольку в ней
        // нарушается действительно завершенное состояние переменной num
        // num = 9;
    }
}
