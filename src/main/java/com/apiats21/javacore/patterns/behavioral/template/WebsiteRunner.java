package main.java.com.apiats21.javacore.patterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n========================================\n");

        newsPage.showPage();

    }
}

class WelcomePage extends WebsiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}

class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}

abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}


