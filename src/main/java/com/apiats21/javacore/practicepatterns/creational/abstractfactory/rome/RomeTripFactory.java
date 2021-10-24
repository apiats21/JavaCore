package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.rome;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Excursion;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Hotel;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Ticket;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.TripFactory;

public class RomeTripFactory implements TripFactory {
    @Override
    public Ticket getTicket() {
        return new FlightToRome();
    }

    @Override
    public Hotel getHotel() {
        return new HotelInRome();
    }

    @Override
    public Excursion getExcursion() {
        return new ExcursionInRome();
    }
}
