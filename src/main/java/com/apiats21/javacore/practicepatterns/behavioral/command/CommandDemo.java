package main.java.com.apiats21.javacore.practicepatterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        User user = new User(new turnOnCommand(tv), new channelSearchCommand(tv), new turnOffCommand(tv));
        user.turnOnTV();
        user.channelSearchTV();
        user.turnOffTV();
    }
}

interface Command {
    void execute();
}

// Receiver
class TV {
    void turnOn() {
        System.out.println("TV is on...");
    }

    void channelSearch() {
        System.out.println("TV is searching for channels");
    }

    void turnOff() {
        System.out.println("TV is off...");
    }
}

// concrete commands
class turnOnCommand implements Command {
    TV tv;

    public turnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

class channelSearchCommand implements Command {
    TV tv;

    public channelSearchCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.channelSearch();
    }
}

class turnOffCommand implements Command {
    TV tv;

    public turnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

// Invoker
class User {
    Command turnOn;
    Command channelSearch;
    Command turnOf;

    public User(Command turnOn, Command channelSearch, Command turnOf) {
        this.turnOn = turnOn;
        this.channelSearch = channelSearch;
        this.turnOf = turnOf;
    }

    void turnOnTV() {
        turnOn.execute();
    }

    void channelSearchTV() {
        channelSearch.execute();
    }

    void turnOffTV() {
        turnOf.execute();
    }
}