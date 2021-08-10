package main.java.com.apiats21.javacore.chapter15;
// Продемонстрировать ссылку на статический метод

import java.util.function.Predicate;

// Фунционалный интерфейс для операций с символьными строками
interface StringFunc2{
    String func(String n);
}

// В этом интерфейсе определяется статический метод strReverse()
class MyStringOps {
    // Статический метод, изменяющий порядок
    // следования символов в строке
    static String strReverse(String str) {
        String result = "";
        int i;

        for(i=str.length()-1; i>=0; i-- )
            result = result + str.charAt(i);
        return  result;
    }

}
public class MethodRefDemo {

    // В этом методе функциональный интерфейс указывается в качестве
    // типа первого его параметра. Следовательно, ему может быть передан
    // любой экземпляр этого интерфейса, включая ссылку на метод
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходняя строка: " + inStr);
        System.out.println("Обрашенная строка: " + outStr);
    }
}
