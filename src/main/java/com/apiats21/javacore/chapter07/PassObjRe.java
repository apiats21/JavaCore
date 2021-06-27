package main.java.com.apiats21.javacore.chapter07;
// Обьекты передаются по ссылке на них
class Test2 {
    int a, b;
    Test2 (int i, int j) {
        a = i;
        b = j;
    }

    void meth (Test2 obj) {
        obj.a *= 2;
        obj.b /= 2;
    }
}
public class PassObjRe {
    public static void main(String[] args) {
        Test2 obj = new Test2(15,20);
        System.out.println("a и b до вызова " + obj.a + " " + obj.b);

        obj.meth(obj);
        System.out.println("а и b после вызова " + obj.a + " " + obj.b);
    }
}
