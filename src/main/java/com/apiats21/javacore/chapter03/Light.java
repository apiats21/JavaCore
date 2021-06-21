package main.java.com.apiats21.javacore.chapter03;

// Вычислить расстояние, проходимое светом,
// используя переменные типа long

public class Light {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительна скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указатель количества дней

        seconds = days * 24 * 60 * 60; // преобразовать в секунды

        distance = lightspeed * seconds ; // вычесллить расстояние

        System.out.print("За " + days);
        System.out.print(" свет пройдет около ");
        System.out.println(distance + " миль.");

    }
}
