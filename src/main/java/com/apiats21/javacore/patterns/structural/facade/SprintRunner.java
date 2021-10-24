package main.java.com.apiats21.javacore.patterns.structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}

class Workflow{
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Job job = new Job();

    void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}

class Job{
    public void doJob(){
        System.out.println("Job in progress...");
    }
}

class BugTracker{
    private boolean activeSprint;
    boolean isActiveSprint() {
        return activeSprint;
    }

    void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    void finishSprint(){
        System.out.println("Sprint finished");
        activeSprint = false;
    }
}

class Developer{
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrahabr");
        }
    }
}

