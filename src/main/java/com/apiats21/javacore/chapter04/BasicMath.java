package main.java.com.apiats21.javacore.chapter04;
// Продемонстриривать основные арифметические операции
public class BasicMath {
    public static void main(String[] args) {
        // арифмитические операции над целочисленными значениями
        System.out.println("Целочисленная арифметика");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = - d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // арифмитические операции над значениями типа double
        double da = 1 + 1;
        double db =  da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}
