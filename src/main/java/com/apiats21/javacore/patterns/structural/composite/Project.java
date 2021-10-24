package main.java.com.apiats21.javacore.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstDeveloper = new JavaDeveloper();
        Developer secondDeveloper = new JavaDeveloper();
        Developer thirdDeveloper = new CppDeveloper();

        team.addDeveloper(firstDeveloper);
        team.addDeveloper(secondDeveloper);
        team.addDeveloper(thirdDeveloper);

        team.writeCode();

    }
}
class Team implements Developer{
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team creates project...");
        for(Developer developer:developers){
            developer.writeCode();
        }
    }
}

interface Developer{
    public void writeCode();
}

class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}

class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}
