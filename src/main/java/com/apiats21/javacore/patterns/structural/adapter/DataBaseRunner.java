package main.java.com.apiats21.javacore.patterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
