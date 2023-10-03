package com.book.objects.oop.dip;

interface Tire {
    void print();
}

class RegularTire implements Tire {

    @Override
    public void print() {
        System.out.println("일반 타이어");
    }
}

class SnowTire implements Tire {

    @Override
    public void print() {
        System.out.println("스노우 타이어");
    }
}

class WideTire implements Tire {

    @Override
    public void print() {
        System.out.println("광폭 타이어");
    }
}

class Car {
    private Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public void printTire() {
        tire.print();
    }
}

public class Example2 {
    public static void main(String[] args) {
        Car regularTireCar = new Car(new RegularTire());
        Car snowTireCar = new Car(new SnowTire());
        Car wideTireCar = new Car(new WideTire());

        regularTireCar.printTire();
        snowTireCar.printTire();
        wideTireCar.printTire();
    }
}