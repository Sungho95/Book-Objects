package com.book.objects.designpattern.decorator;

// ConcreteDecoratorB
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return super.getCoffee() + " 설탕추가";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }
}
