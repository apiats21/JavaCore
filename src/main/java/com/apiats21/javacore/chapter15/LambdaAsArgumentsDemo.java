package main.java.com.apiats21.javacore.chapter15;
// Передать лямбда-выражение в качестве аргумента методу.

import java.util.Locale;

interface StringFunc1 {
    String func(String n);
}

public class LambdaAsArgumentsDemo {

    // Первый парамент этого метода имеет тип функционального
    // интерфейса. Следовательно, ему можно передать ссылку на
    // любой экземпляр этого интерфейса, включая экземпляр,
    // создаваемый в лямбда-выражении. А второй парамент
    // обозначает обрабатываемую символьную строку
    static String stringOp(StringFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
            String inStr = "Лямбда-выражения повышают эффективность Java";
            String outStr;

        System.out.println("Эта исходная строка: " + inStr);

        // Ниже приведено простое лямбда-выражение, преобразуещее
        // в верхний регистр букв все символы исходной строки,
        // передоваемые методу StringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Эта строка в верхнем регистре: " + outStr);

        // А здесь передается блочное лямбда-выражение, удаляющее
        // пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for(i=0; i<str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

                return result;
        }, inStr );

        System.out.println("Эта строка с удаленными пробелами: " + outStr);

        // Конечно можно и передать экземпляр интерфейса StringFunc1,
        // созданный в предыдущем лямбда-выражении. Например, после
        // следующего обьявления ссылка reverse делается на экземпляр
        // интерфейса StringFunc1
        StringFunc1 reverse = (str) -> {
          String result = "";
          int i;

          for(i = str.length()-1; i>=0; i--)
              result = result + str.charAt(i);

          return result;
        };

        // А теперь ссылку reserve можно передать в качестве первого
        // параметра методу stringOp()
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));

    }
}
