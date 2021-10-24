package main.java.com.apiats21.javacore.practicepatterns.creational.singleton;

public class Singleton {
    private static Singleton singleton;
    private static int counter = 0;

    private Singleton() {
    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            counter++;
            return new Singleton();
        }
        counter++;
        return singleton;
    }

    public static void getCount() {
        System.out.println(counter);
    }
}
