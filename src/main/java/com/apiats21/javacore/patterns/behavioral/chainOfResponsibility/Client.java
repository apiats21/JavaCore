package main.java.com.apiats21.javacore.patterns.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);

    }
}

abstract class Notifier{
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level){
        if(level >= priority){
            write(message);
        }
        if(nextNotifier!=null){
            nextNotifier.notifyManager(message, level);
        }
    }
    abstract void write(String message);
}

class Priority{
    public static final int ROUTINE = 1;
    public static final int IMPORTANT = 2;
    public static final int ASAP = 3;
}

class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Notifying  using simple report " + message);
    }
}

class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Sending SMS to manager " + message);
    }
}


