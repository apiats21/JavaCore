package main.java.com.apiats21.javacore.chapter07;
// определить внутренний класс в цикле for
class Outer3 {
    int outer_x = 100;

    void test() {
        for(int i=0; i<10; i++) {
            class Inner {
                void display(){
                    System.out.println("вывод: outer_x: " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 ob = new Outer3();
        ob.test();
    }
}
