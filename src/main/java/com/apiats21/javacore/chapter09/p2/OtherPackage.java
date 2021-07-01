package main.java.com.apiats21.javacore.chapter09.p2;

import main.java.com.apiats21.javacore.chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из другог пакета");

        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);

        // доступно только для класса
        // System.out.println("n_pri = " +p.n_pri);

        // доступто только для данного класса, подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
