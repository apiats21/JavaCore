package main.java.com.apiats21.javacore.practicepatterns.behavioral.chainOfResponsibility;

public class ATM {
    public static void main(String[] args) {
        Dispenser dispense20 = new Dispense20(20);
        Dispenser dispense5 = new Dispense5(5);
        Dispenser dispense1 = new Dispense1(1);
        dispense20.setNext(dispense5);
        dispense5.setNext(dispense1);
        dispense20.dispenseCash(417);
    }
}

abstract class Dispenser {
public void dispenseCash(int withdrawAmount) {
    if(withdrawAmount > bills) {
        System.out.println("ATM disposal " + (withdrawAmount / bills) + " $" + bills + " bills");
    }
    if(next!=null){
        next.dispenseCash((withdrawAmount % bills));
    }
}

    Dispenser next;
    public void setNext(Dispenser next) { this.next = next; }
    int bills;

    public Dispenser(int bills) {
        this.bills = bills;
    }
}

class Dispense20 extends Dispenser {
    public Dispense20(int bills) { super(bills); }
}

class Dispense5 extends Dispenser {
    public Dispense5(int bills) { super(bills); }
}

class Dispense1 extends Dispenser {
    public Dispense1(int bills) { super(bills); }
}


