package main.java.com.apiats21.javacore.practicepatterns.behavioral.state;

import java.util.Random;

public class StateDEmo {
    public static void main(String[] args) throws InterruptedException {
        PlayList playList = new Song1();
        Player player = new Player();
        player.setPlayList(playList);

        for (int i = 0; i < 5; i++) {
            player.play();
            player.shufflePlayList();
            Thread.sleep(3000);
        }

    }
}

interface PlayList {
    void play();
}

class Song1 implements PlayList {
    @Override
    public void play() {
        System.out.println("Playing song #1...");
    }
}

class Song2 implements PlayList {
    @Override
    public void play() {
        System.out.println("Playing song #2...");
    }
}

class Song3 implements PlayList {
    @Override
    public void play() {
        System.out.println("Playing song #3...");
    }
}

class Player {
    PlayList playList;

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }

    void shufflePlayList() {
        Random random = new Random();
        int randomTrackNumber = random.nextInt(4);
        switch (randomTrackNumber) {
            case 1 -> setPlayList(new Song1());
            case 2 -> setPlayList(new Song2());
            case 3 -> setPlayList(new Song3());
        }
    }

    void play() {
        playList.play();
    }
}

