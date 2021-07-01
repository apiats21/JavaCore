package main.java.com.apiats21.javacore.chapter09.p1;

import org.w3c.dom.ls.LSOutput;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub =4;

    public Protection () {
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class Delivered extends Protection {
    Delivered() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

      // доступно только для класса
      //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}