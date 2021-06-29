package main.java.com.apiats21.javacore.chapter08;
/*  В иеархии классов закрытые члены остаются закрытыми
    в пределах своего класса

    Эта программа содержит ошибку, и поэтому
    скомпелировать ее не удастся.
 */

// создать суперкласс
class A1 {
    int i;          // этот член окрыт по умолчанию
     int j;  // а этот член закрыт в классе A

    void setij (int x, int y) {
        i = x;
        j = y;
    }
}
// член j класса A в этом классе недоступен
class B1 extends A1 {
    int  total;

    void sum() {
        // total = i + j; // ОШИБКА!!!: член j в этом классе недоступен
    }
}

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
