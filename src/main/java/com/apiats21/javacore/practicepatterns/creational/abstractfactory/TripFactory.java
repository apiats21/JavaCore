package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory;

public interface TripFactory {
    Ticket getTicket();
    Hotel getHotel();
    Excursion getExcursion();
}
