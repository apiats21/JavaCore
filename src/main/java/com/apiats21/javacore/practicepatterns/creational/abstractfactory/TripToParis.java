package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.paris.ParisTripFactory;

public class TripToParis {
    public static void main(String[] args) {
        TripFactory tripFactory = new ParisTripFactory();
        Ticket ticket = tripFactory.getTicket();
        Hotel hotel = tripFactory.getHotel();
        Excursion excursion = tripFactory.getExcursion();

        System.out.println("Trip to Paris.");
        ticket.bookTicket();
        hotel.bookHotel();
        excursion.bookExcursion();
    }
}
