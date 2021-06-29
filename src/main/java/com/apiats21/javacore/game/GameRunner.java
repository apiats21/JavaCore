package main.java.com.apiats21.javacore.game;

import java.util.Scanner;

// камень-ножницы-бумага
// сущность, описывает поле
class Field {
    void welcomeScreen() {
        System.out.println("Hello! Lets play rock-scissors-paper!");
        System.out.println("Please select only one option:");
        System.out.println(" 1. Rock\n 2. Scissors\n 3. Paper");
    }
}

// содержит бизнес-логику
class GameLogic {
    String battle () {
        String[] options = {"", "камень", "ножницы", "бумагу"};

        Scanner userChoice = new Scanner(System.in);
        int user = userChoice.nextInt();
        int pc = (int) ((Math.random() * 3) + 1);
        System.out.println("Вы выбрали: " + options[user] +
                         "\nКомпьютер выбрал: " + options[pc]);

        if (user == pc) return "Ничья!!!";
            else if (((user == 1) & (pc == 2) ) || ((user == 2) & (pc == 3) || ((user == 3) & (pc == 1))))
                return "Вы выиграли!!!";
        else return "Вы проиграли!!!";
    }
}

public class GameRunner {
    public static void main(String[] args) {
        Field game = new Field();
        game.welcomeScreen();
        GameLogic ob1 = new GameLogic();
        //ob1.battle();
        System.out.println(ob1.battle());
    }
}
