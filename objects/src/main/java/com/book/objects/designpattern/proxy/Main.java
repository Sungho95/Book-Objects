package com.book.objects.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        ReservationService reservationService = new ReservationService();

        // 여행 예약 추가
        Reservation reservation = new Reservation(1, "Alice", "Paris");
        reservationService.addReservation(reservation);

        // 여행 예약 검색
        Reservation foundReservation = reservationService.findReservation(1);
        if (foundReservation != null) {
            System.out.println("Reservation ID: " + foundReservation.getReservationId() +
                    ", Traveler: " + foundReservation.getTravelerName() +
                    ", Destination: " + foundReservation.getDestination());
        } else {
            System.out.println("Reservation not found.");
        }
    }
}
