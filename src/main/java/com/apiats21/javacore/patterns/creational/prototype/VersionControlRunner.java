package main.java.com.apiats21.javacore.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject", "SourceCode sourcecode = new Sourcecode");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();


        System.out.println(masterClone);

    }
}
