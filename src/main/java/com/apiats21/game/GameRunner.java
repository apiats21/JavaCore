package main.java.com.apiats21.game;

import java.util.Random;
import java.util.Scanner;

// камень-ножницы-бумага
// сущность, описывает поле
class Field {
    static String op = " 1. Rock\n 2. Scissors\n 3. Paper";
    enum Move {
        Rock, Paper, Scissors
    }
}

// содержит бизнес-логику
class GameLogic {
    public main.java.com.apiats21.game.Field.Move userMove() {
        System.out.println(main.java.com.apiats21.game.Field.op);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1) return main.java.com.apiats21.game.Field.Move.Rock;
        else if (a==2) return main.java.com.apiats21.game.Field.Move.Scissors;
        else if (a==3) return main.java.com.apiats21.game.Field.Move.Paper;
        else return userMove();

    }
    public main.java.com.apiats21.game.Field.Move compMove() {
        main.java.com.apiats21.game.Field.Move[] moves = main.java.com.apiats21.game.Field.Move.values();
        Random rand = new Random();
        int index = rand.nextInt(3);
        return moves[index];
    }
    void compareMove (main.java.com.apiats21.game.Field.Move compMove) {

    }
}

public class GameRunner {
    public static void main(String[] args) {
        main.java.com.apiats21.game.GameLogic gm = new main.java.com.apiats21.game.GameLogic();
        //gm.userMove();
        System.out.println(gm.userMove());
        System.out.println(gm.compMove());
        //int roll = gm.compMove();


    }
}
