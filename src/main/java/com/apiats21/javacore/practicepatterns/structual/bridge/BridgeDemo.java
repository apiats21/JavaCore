package main.java.com.apiats21.javacore.practicepatterns.structual.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Movie movie = new Comedy(new PG13());
        movie.showRating();
    }
}

abstract class Movie{
    Ratings rating;

    public Movie(Ratings rating) {
        this.rating = rating;
    }

    abstract void showRating();
}

class Documentary extends Movie{

    public Documentary(Ratings rating) { super(rating); }

    @Override
    void showRating() {
        System.out.println("Documentary");
        rating.showRating();
    }
}
class Comedy extends Movie{

    public Comedy(Ratings rating) { super(rating); }

    @Override
    void showRating() {
        System.out.println("Comedy");
        rating.showRating();
    }
}


interface Ratings{
    void showRating();
}

class GeneralRating implements Ratings{
    @Override
    public void showRating() {
        System.out.println("Movie has General Rating");
    }
}

class PG implements Ratings {
    @Override
    public void showRating() {
        System.out.println("Movie has PG rating");
    }
}

class PG13 implements Ratings{
    @Override
    public void showRating() {
        System.out.println("Movie has PG-13 rating");
    }
}
