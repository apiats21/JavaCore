package main.java.com.apiats21.javacore.patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}

interface Activity {
    public void justDoIt();
}

class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Writing code...");
    }
}

class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}

class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}

class Training implements Activity {
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

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        } else  if (activity instanceof Training) {
            setActivity(new Coding());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}










