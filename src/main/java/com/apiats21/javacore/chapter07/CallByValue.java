package main.java.com.apiats21.javacore.chapter07;
// Аргументы примитивных типов передаются по значению
class Test1 {
    void meth(int i, int j) {
        i *=2;
        j /=2;
    }

}
public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15;
        int b = 10;

        System.out.println("a и b до вызова " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a и b после вызова " + a + " " + b);
    }
}
