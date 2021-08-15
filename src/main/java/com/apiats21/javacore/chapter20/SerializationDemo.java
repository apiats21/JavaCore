package main.java.com.apiats21.javacore.chapter20;

import java.io.*;

// Продемострировать применение сериализации и десериализации.
// В этой программе используется оператор try  с ресурсами.
// Требуется установка комплекта JDK, начиная с версии 7
public class SerializationDemo {
    public static void main(String[] args) {
        // происвести сериализацию объекта

        try
            (ObjectOutputStream objOStrm =
             new ObjectOutputStream(new FileOutputStream("serial.txt")) )
        {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("Object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Ислключение при сериализации" + e);
        }

        // произвести десериализацию объекта

        try (ObjectInputStream objIStrm =
            new ObjectInputStream(new FileInputStream("serial.txt")) )
        {
            MyClass object2 = (MyClass)objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации " + e);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return  "s='" + s +  ", i=" + i + ", d=" + d;
    }
}
