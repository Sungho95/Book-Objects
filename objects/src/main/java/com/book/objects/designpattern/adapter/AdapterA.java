package com.book.objects.designpattern.adapter;

public class AdapterA implements Target {
    private ServiceA adapteeA;

    public AdapterA(ServiceA adapteeA) {
        this.adapteeA = adapteeA;
    }

    @Override
    public void runService() {
        System.out.println("AdapterA");
    }
}
