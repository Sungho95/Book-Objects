package com.book.objects.designpattern.proxy;

class ReservationServiceProxy implements ReservationServiceSubject {
    private ReservationServiceRealSubject reservationService = new ReservationServiceRealSubject();

    public void addReservation(Reservation reservation) {
        // 여행 예약을 추가하기 전에 어떤 작업을 수행할 수 있음
        reservationService.addReservation(reservation);
    }

    public Reservation findReservation(int reservationId) {
        // 여행 예약을 조회하기 전에 어떤 작업을 수행할 수 있음
        return reservationService.findReservation(reservationId);
    }
}