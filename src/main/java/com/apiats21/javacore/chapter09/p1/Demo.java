package main.java.com.apiats21.javacore.chapter09.p1;
// Демонстрационный пакет p1

import main.java.com.apiats21.javacore.chapter09.p2.Protection2;

// получить экзэмпляры различных классов из пакета p1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Delivered ob2 = new Delivered();
        SamePackage ob3 = new SamePackage();
    }
}
