package main.java.com.apiats21.javacore.chapter07;
/* В этой программе димонстрируется отличие
   модификаторов public и private
*/
class Test4 {
    int a;          // доступ, определяемый по умолчанию
    public int b;   // открытый доступ
    private int c;  // закрытый доступ

    // методы доступа к члену c данного класса
    void setC (int i) { // установить значение члена c данного класса
        c = i;
    }
    int getC () {       // получить значение члена c данного класса
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        // эти операторы правильны, поэтому члены a и b
        // данного класса доступны непосредстженно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ощибку
       // ob.c = 100; // ОШИБКА!!!

        // доступ к члену данного класс должен осуществлятся
        // с помощью методов ее класса
        ob.setC(100);
        System.out.println("a и b и c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
