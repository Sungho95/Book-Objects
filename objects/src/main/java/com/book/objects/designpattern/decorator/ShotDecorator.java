package com.book.objects.designpattern.decorator;

// ConcreteDecoratorA
public class ShotDecorator extends CoffeeDecorator {
    public ShotDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return super.getCoffee() + " 샷추가";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }
}
