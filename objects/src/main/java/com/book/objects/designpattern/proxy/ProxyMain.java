package com.book.objects.designpattern.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ReservationServiceProxy reservationService = new ReservationServiceProxy();

        // 여행 예약 추가
        Reservation reservation = new Reservation(1, "홍길동", "프랑스 파리");
        reservationService.addReservation(reservation);

        // 여행 예약 검색
        Reservation findReservation = reservationService.findReservation(1);
        if (findReservation != null) {
            System.out.println("예약 번호: " + findReservation.getReservationId() +
                    ", 여행자: " + findReservation.getTravelerName() +
                    ", 목적지: " + findReservation.getDestination());
        } else {
            System.out.println("예약 정보를 찾을 수 없습니다.");
        }
    }
}