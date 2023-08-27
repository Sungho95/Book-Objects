package com.book.objects.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓 판매시 티켓 리스트에서 제거 후 반환
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    // 티켓 환불시 판매 금액 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 티켓 판매시 판매 금액 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
