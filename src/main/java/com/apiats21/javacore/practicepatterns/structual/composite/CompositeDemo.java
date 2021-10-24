package main.java.com.apiats21.javacore.practicepatterns.structual.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Teacher t1 = new English();
        Teacher t2 = new Math();
        Teacher t3 = new History();

        Composite c1 = new Composite();
        c1.addComponent(t1);
        c1.addComponent(t2);
        c1.addComponent(t2);


        Composite c2 = new Composite();

        c2.addComponent(c1);
        c2.addComponent(t3);
        c2.teach();
    }
}

interface Teacher{
    void teach();
}

class English implements Teacher{
    @Override
    public void teach() {
        System.out.println("Teaching English");
    }
}

class Math implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teaching Math");
    }
}

class History implements Teacher{
    @Override
    public void teach() {
        System.out.println("Teaching History");
    }
}

class Composite implements Teacher{
    private List<Teacher> components = new ArrayList<>();

    public void addComponent(Teacher component){
        components.add(component);
    }

    public void removeComponent(Teacher component){
        components.remove(component);
    }
    @Override
    public void teach() {
        for(Teacher component:components){
            component.teach();
        }
    }
}


