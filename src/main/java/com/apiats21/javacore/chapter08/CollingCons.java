package main.java.com.apiats21.javacore.chapter08;
// Продемострировать порядок вызова конструкторов

// создать суперкласс
class A3 {
    A3() {
        System.out.println("В конструкторе A");
    }
}

// Создать подкласс путем расширения класса A
class B3 extends A3{
    B3() {
        System.out.println("В конструкторе B");
    }
}

// создать еще один подкласс путем расширения класса B
class C3 extends B3{
    C3() {
        System.out.println("В конструкторе C");
    }
}

public class CollingCons {
    public static void main(String[] args) {
        C3 ob = new C3();
    }
}
