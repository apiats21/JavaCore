package main.java.com.apiats21.javacore.chapter09;
// еще одна реализация интерфейса Callback
class AnotherClient implements Callback {
    public void Callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("P в квадрате равно " + (p * p));
    }
}

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Clients();
        AnotherClient ob = new AnotherClient();
        c.Callback(42);
        c = ob;
        c.Callback(42);
    }
}
