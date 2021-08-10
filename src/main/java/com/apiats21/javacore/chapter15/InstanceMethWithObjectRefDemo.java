package main.java.com.apiats21.javacore.chapter15;

// Использовать ссылку на метод экземпляра вместе с разными объектами

// Функциональный интерфейс с методом, принимающим два ссылочных
// аргумента и возвращающим логическое значение
interface MyFunc11<T>{
    boolean func(T v1, T v2);
}

// Класс для храниния мааксимальной температуры за день
class HighTemp {
    private int hTemp;

    HighTemp(int ht) { ht = hTemp; }

    // возвратить логическое значение true, если вызывающий объект
    // типа HighTemp имеет такую же температуру, как и объекта ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // возвратить логическое значение tru, если вызываюющий объект
    // типа HighTemp имеет температуру ниже, чем у объекта ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {

    // Метод, возвращающий количество экземпляров объекта,
    // найденых по критериям, задаваемым параметром
    // функционального интерфейса myFunc
    static <T> int counter(T[] vals, MyFunc11<T> f, T v) {
        int count = 0;

        for(int i=0; i< vals.length; i++)
            if(f.func(vals[i], v)) count++;
            return count;
    }

    public static void main(String[] args) {
        int count;

        // Создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = { new HighTemp(82), new HighTemp(82),
                                    new HighTemp(90), new HighTemp(89),
                                    new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83) };

        // Использовать метод counter() вместе с массивами объектов
        // типа HighTemp. Обратите внимание на то, что ссылка на метод
        // экземпляра sameTemp() передается в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней когда максимальная температура была 89 градусов: " + count);

        // А теперь создать и использовать вместе с данным
        // методом еще один массив обьектов типа HighTemp
        HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(812),
                                     new HighTemp(24), new HighTemp(19),
                                     new HighTemp(18), new HighTemp(12),
                                     new HighTemp(-1), new HighTemp(13) };

        count = counter(weekDayHighs2, HighTemp::sameTemp,
                new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + count);

        // А теперь воспользоваться методом lessThanTemp(), чтобы
        // выяснить, сколько дней температура была меньше заданной
        count = counter(weekDayHighs, HighTemp::lessThanTemp,
                        new HighTemp(89));
        System.out.println(
                "Дней, когда максимальная температура была меньше 89: " + count);
        count = counter(weekDayHighs2, HighTemp::lessThanTemp,
                new HighTemp(12));
        System.out.println(
                "Дней, когда максимальная температура была меньше 12: " + count);
    }
}
