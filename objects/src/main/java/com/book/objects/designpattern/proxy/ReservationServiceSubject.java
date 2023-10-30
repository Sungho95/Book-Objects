package com.book.objects.designpattern.proxy;

public interface ReservationServiceSubject {
    void addReservation(Reservation reservation);
    Reservation findReservation(int reservationId);
}
