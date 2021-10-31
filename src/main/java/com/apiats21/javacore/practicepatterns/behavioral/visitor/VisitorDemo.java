package main.java.com.apiats21.javacore.practicepatterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor badMechanic = new BadMechanic();

        body.accept(badMechanic);
        engine.accept(badMechanic);

        Visitor goodMechanic = new GoodMechanic();
        engine.accept(goodMechanic);
        body.accept(goodMechanic);

    }
}

// Visitor
interface Visitor {
    void visit(EngineElement engine);

    void visit(BodyElement body);
}

interface Element {
    void accept(Visitor visitor);
}

class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class BadMechanic implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Broken engine...");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Damaged paint...");
    }
}

class GoodMechanic implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Fix engine...");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Repair paint...");
    }
}


