package main.java.com.apiats21.javacore.chapter07;
// Обьекты допускаются передавать методам в качестве параметров
class Test {
    int a, b;

    Test (int i, int j) {
    a = i;
    b = j;
    }

    // возвратить логическое значение true,если в качествеп
    // параметра o указан вызывающий обьект
    boolean equals (Test o) {
        if (o.a == a && o.b == b) return true;
                else return false;
    }
}
public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2 " + ob1.equals(ob2));
        System.out.println("ob1 == ob3 " + ob1.equals(ob3));
    }
}
