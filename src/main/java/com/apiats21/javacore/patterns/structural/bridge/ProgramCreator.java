package main.java.com.apiats21.javacore.patterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Program program:programs){
            program.developProgram();
        }
    }
}
