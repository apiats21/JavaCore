package main.java.com.apiats21.javacore.practicepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorDemo {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User u1 = new SimpleUser(chat, "user1");
        User u2 = new SimpleUser(chat, "user2");

        chat.addUser(u1);
        chat.addUser(u2);

        u1.sendMessage(" Hello, from u1");
    }
}

interface User {
    void sendMessage(String message);

    void getMessage(String message);
}

class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "User gets message" + message);
    }
}

interface Chat {
    void sendMessage(String message, User user);
}

class TextChat implements Chat {
    List<User> users = new ArrayList<>();

    public void addUser(User u) {
        users.add(u);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            u.getMessage(message);
        }
    }
}

