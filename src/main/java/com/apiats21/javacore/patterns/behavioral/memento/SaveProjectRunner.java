package main.java.com.apiats21.javacore.patterns.behavioral.memento;

import java.util.Date;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo github = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        github.setSave(project.save());

        System.out.println();

        System.out.println("Updating project to vrsion 1.1");

        System.out.println("Writing bad code...");
        Thread.sleep(5000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}

class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion: " + version +
                "\nDate=" + date + "\n";
    }
}

class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}

class GitHubRepo {
    private Save save;

    public Save getSave(){
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

