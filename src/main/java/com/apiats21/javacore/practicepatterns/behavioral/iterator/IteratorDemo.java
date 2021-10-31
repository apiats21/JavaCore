package main.java.com.apiats21.javacore.practicepatterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();

        Iterator iterator = concreteAggregate.getIterator();

        while(iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
    }
}

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Aggregate {
    Iterator getIterator();
}

class ConcreteAggregate implements Aggregate {
    String[] tasks = {"First", "Second", "Third"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

