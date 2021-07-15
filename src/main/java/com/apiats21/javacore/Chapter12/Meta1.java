package main.java.com.apiats21.javacore.Chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Обьявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();
    int val();
}

 class Meta1 {
    // У метода myMeth() теперь есть два аргумента
    @MyAnno1(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta1 ob = new Meta1();

        try {
            Class<?> c = ob.getClass();
            // Здесь указываются типы параметров
            Method m = c.getMethod("Mymeth", String.class, int.class);
            MyAnno1 anno = m.getAnnotation(MyAnno1.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
