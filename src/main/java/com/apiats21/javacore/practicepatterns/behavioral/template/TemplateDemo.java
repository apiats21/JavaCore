package main.java.com.apiats21.javacore.practicepatterns.behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        Template a = new A();
        Template b = new B();

        a.method();
        b.method();
    }
}

class A extends Template {
    @Override
    public void body() {
        System.out.println("2");
    }
}

class B extends Template {
    @Override
    public void body() {
        System.out.println("5");
    }
}

abstract class Template {
    public void method() {
        System.out.println("1");
        body();
        System.out.println("3");
    }

    public abstract void body();
}