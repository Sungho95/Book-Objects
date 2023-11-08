package com.book.objects.oop.lsp;

class Car {
    public void move() {
        System.out.println("붕붕");
    }
}

class Casper extends Car {
    @Override
    public void move() {
        System.out.println("캐스퍼 붕붕");
    }
}

class Sonata extends Car {

}

class Main {
    public static void main(String[] args) {
        Car casper = new Casper();
        Car sonata = new Sonata();

        letsMove(casper);
        letsMove(sonata);
    }

    public static void letsMove(Car car) {
        car.move();
    }
}