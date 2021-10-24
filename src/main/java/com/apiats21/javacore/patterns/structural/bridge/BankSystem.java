package main.java.com.apiats21.javacore.patterns.structural.bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress... ");
        developer.writeCode();
    }
}
