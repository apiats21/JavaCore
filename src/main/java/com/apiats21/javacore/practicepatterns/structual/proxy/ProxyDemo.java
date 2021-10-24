package main.java.com.apiats21.javacore.practicepatterns.structual.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Movie movie = new ProxyMovie("c://movie.mp4");
        movie.show();
    }
}

interface Movie {
    void show();
}

class RealMovie implements Movie {
    String file;

    public RealMovie(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("File loading... " + file);
    }

    @Override
    public void show() {
        System.out.println("Showing video... " + file);
    }
}

class ProxyMovie implements Movie {
    String file;
    RealMovie movie;

    public ProxyMovie(String file) {
        this.file = file;
    }

    @Override
    public void show() {
        if (movie == null) {
            movie = new RealMovie(file);
        }
        movie.show();
    }
}
