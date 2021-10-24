package main.java.com.apiats21.javacore.patterns.structural.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code");
    }
}
