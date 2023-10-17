package com.book.objects.designpattern.adapter;

public class ClientWithAdapter {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        Target adapterA = new AdapterA(serviceA);
        Target adapterB = new AdapterB(serviceB);

        adapterA.runService();
        adapterB.runService();
    }
}
