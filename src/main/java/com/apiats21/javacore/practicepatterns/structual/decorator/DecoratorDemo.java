package main.java.com.apiats21.javacore.practicepatterns.structual.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
//        PrinterInterface printer = new Printer("Hello");
        PrinterInterface printer = new DecoratorGreeting(new Printer("world!"));
        printer.print();
    }
}

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) { this.value = value; }
    @Override
    public void print() {
        System.out.print(value);
    }
}

class DecoratorGreeting implements PrinterInterface{
    PrinterInterface component;

    public DecoratorGreeting(PrinterInterface component) { this.component = component; }
    @Override
    public void print() {
        System.out.print("Hello, ");
        component.print();
    }
}
