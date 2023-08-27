package com.book.objects.chapter1;

public class Bag {
    private long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.amount = amount;
        this.invitation = invitation;
    }

    // 초대장 보유 여부를 판단
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 티켓의 소유 여부 판단
    public boolean hasTicket() {
        return ticket != null;
    }

    // 초대장을 티켓으로 교환
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 티켓 구매 시 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 티켓 환불 시 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
