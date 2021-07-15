package main.java.com.apiats21.javacore.Chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Обьявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
    // аннотиривать метод
    @MyAnno(str = "примен аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // получить аннотацию из метода
        // и вывести значения ее членов
        try {
            // Сначала получить обьект типа класс
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // затем получить обьек типа object
            // представляющий данный метод
            Method m = c.getMethod("MyMeth");

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // И наконец вывести значение членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
