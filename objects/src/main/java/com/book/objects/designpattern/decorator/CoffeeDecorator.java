package com.book.objects.designpattern.decorator;

// Decorator
public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCoffee() {
        return coffee.getCoffee();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
}
