package main.java.com.apiats21.javacore.patterns.behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}

interface Activity {
    public void justDoIt();
}

class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding...");
    }
}

class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}

class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}

class Training implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}

class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
