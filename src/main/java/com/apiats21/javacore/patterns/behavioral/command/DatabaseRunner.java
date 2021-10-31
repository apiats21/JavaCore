package main.java.com.apiats21.javacore.patterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.deleteRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }

}

class Database {
    public void insert(){
        System.out.println("Inserting record...");
    }

    public void update(){
        System.out.println("Updating record...");
    }

    public void select(){
        System.out.println("Selecting record...");
    }

    public void delete(){
        System.out.println("Deleting record...");
    }
}

interface Command{
    public void execute();
}

class InsertCommand implements Command{
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}

class UpdateCommand implements Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}

class SelectCommand implements Command{
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}

class DeleteCommand implements Command{
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}

class Developer{
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }

    public void updateRecord(){
        update.execute();
    }

    public void selectRecord(){
        select.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }
}





