package main.java.com.apiats21.javacore.patterns.structural.bridge;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();

}
