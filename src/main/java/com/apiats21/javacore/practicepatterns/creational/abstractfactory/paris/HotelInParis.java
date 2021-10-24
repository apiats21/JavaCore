package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.paris;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Hotel;

public class HotelInParis implements Hotel {
    @Override
    public void bookHotel() {
        System.out.println("\"Four Seasons\" hotel is booked." );
    }
}
