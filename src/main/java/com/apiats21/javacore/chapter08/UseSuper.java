package main.java.com.apiats21.javacore.chapter08;
// Использовать ключевое слово супер с целью предотвратить сокрытие имен
class A2 {
    int i;
}
// создать подкласс путем расшерения класса A;
class B2 extends A2 {
    int i; // этот член скрывает член i из класса A
    B2(int a, int b) {
        super.i = a; // член i из класса A2
        i = b;       // член i из класса B2
    }
    void show() {
        System.out.println("Член i в суперклассе A2: " + super.i);
        System.out.println("Член i в подклассе B2: "+ i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B2 ob = new B2(1,2);
        ob.show();

    }
}
