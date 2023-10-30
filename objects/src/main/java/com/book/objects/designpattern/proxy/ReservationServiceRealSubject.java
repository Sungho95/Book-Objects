package com.book.objects.designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceRealSubject implements ReservationServiceSubject {
    private List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation findReservation(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId() == reservationId) {
                return reservation;
            }
        }
        return null;
    }
}