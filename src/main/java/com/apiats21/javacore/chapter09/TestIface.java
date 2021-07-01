package main.java.com.apiats21.javacore.chapter09;

interface Callback {
    void Callback(int par);
}

class Clients implements Callback {
    // релиазовать интерфэйс Callback
    public void Callback(int p) {
        System.out.println(
                "Метод callback(), вызываемый со значением " + p);
    }

    void NonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " +
                "могут определяться и другие члены  ");
    }
}

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Clients();
        c.Callback(42);
    }
}
