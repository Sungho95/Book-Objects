package com.book.objects.oop.isp;

interface Move {
    void go();
}

interface Fly extends Move {
    void fly();
}

class Car implements Move {

    @Override
    public void go() {
        // ...
    }
}

class Airplane implements Fly {

    @Override
    public void go() {
        // ...
    }

    @Override
    public void fly() {
        // ...
    }
}