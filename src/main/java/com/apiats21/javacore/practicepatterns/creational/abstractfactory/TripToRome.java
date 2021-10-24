package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.rome.RomeTripFactory;

public class TripToRome {
    public static void main(String[] args) {
        TripFactory tripFactory = new RomeTripFactory();
        Ticket ticket = tripFactory.getTicket();
        Hotel hotel = tripFactory.getHotel();
        Excursion excursion = tripFactory.getExcursion();

        ticket.bookTicket();
        hotel.bookHotel();
        excursion.bookExcursion();
    }
}
