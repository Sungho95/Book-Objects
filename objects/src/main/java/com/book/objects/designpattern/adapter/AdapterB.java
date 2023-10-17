package com.book.objects.designpattern.adapter;

public class AdapterB implements Target {
    private ServiceB adapteeB;

    public AdapterB(ServiceB adapteeB) {
        this.adapteeB = adapteeB;
    }

    @Override
    public void runService() {
        System.out.println("AdapterB");
    }
}
