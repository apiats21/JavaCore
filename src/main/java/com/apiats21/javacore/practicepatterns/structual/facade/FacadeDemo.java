package main.java.com.apiats21.javacore.practicepatterns.structual.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Job job = new Job();
        job.gettingJob();
    }
}

class Job{
    JavaCourse course = new JavaCourse();
    Resume resume = new Resume();
    InterView interView = new InterView();

    void gettingJob(){
        course.completeJavaCourse();

        resume.createResume(course);

        interView.passInterview(resume);
    }
}

class JavaCourse{
    public boolean completeJavaCourse() {
        boolean passCourse = false;
        System.out.println("Start Java course...");
        System.out.println("Complete Java course.");
        passCourse = true;
        return passCourse;
    }
}
class Resume{
    boolean resumeStatus = false;

    public void createResume(JavaCourse course) {
        if(course.completeJavaCourse()) {
            System.out.println("Start working on resume");
            resumeStatus = true;
        } else System.out.println("Need to complete JavaCourse");
    }
}

class InterView{
    void passInterview(Resume resume){
        if(resume.resumeStatus) {
            System.out.println("Passing an interview... getting a job");
        } else System.out.println("Finish resume");
    }
}

