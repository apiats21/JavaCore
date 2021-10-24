package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.rome;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Hotel;

public class HotelInRome implements Hotel {
    @Override
    public void bookHotel() {
        System.out.println("Hilton in Rome booked");
    }
}
