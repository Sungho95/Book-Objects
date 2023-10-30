package com.book.objects.designpattern.proxy;

public class Reservation {
    private int reservationId;
    private String travelerName;
    private String destination;

    public Reservation(int reservationId, String travelerName, String destination) {
        this.reservationId = reservationId;
        this.travelerName = travelerName;
        this.destination = destination;
    }

    public int getReservationId() {
        return reservationId;
    }

    public String getTravelerName() {
        return travelerName;
    }

    public String getDestination() {
        return destination;
    }
}
