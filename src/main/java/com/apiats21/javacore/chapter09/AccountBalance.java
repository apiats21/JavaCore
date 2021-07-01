package main.java.com.apiats21.javacore.chapter09;
// Простой пакет
class Balance {
    String name;
    double balance;

    Balance (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void show() {
        if (balance<0) {
            System.out.print("--->");
            System.out.println(name + " : $ " + balance);
        }
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("J. K. Feeling", 123.32);
        current[1]  = new Balance("P.S. Johnson,", -12.32);
        current[2] = new Balance("S.K. Ferry", -23.67);

        for(int i=0; i<3; i++) current[i].show();
    }
}
