package main.java.com.apiats21.javacore.chapter15;
//  Продемонстрировать применние ссылки на метод экземпляра

// Функциональный интерфейс для операций с символьными со строками
interface StringFunction {
    String func(String n);
}

// Теперь в этом классе оппеделяется метод экземпляра strReverse()
class myStringOps {
    String strReverse(String str) {
        String result = "";
        int i;

        for(i=str.length()-1; i>=0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве
    // типа первого его параметра. Следовательно, ему может быть передан
    // любой экземпляр этого интерфейса.
    static String stringOp(StringFunction sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения пожышают эфективность Java";
        String outStr;

        // Создать обьект типа myStringOps
        myStringOps strOps = new myStringOps();


        // А теперь ссылка на метод экземпляра strReserve()
        // передается медоту stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходняя строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }

}
