package main.java.com.apiats21.javacore.practicepatterns.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Human h1 = new Human(30, "John");
        System.out.println(h1);
        HumanFactory factory = new HumanFactory(h1);
        Human h2 = factory.cloneHuman();
        System.out.println(h2);
    }
}
