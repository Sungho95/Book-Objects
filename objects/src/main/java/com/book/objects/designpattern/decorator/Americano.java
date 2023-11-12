package com.book.objects.designpattern.decorator;

// ConcreteComponent
public class Americano implements Coffee {

    @Override
    public String getCoffee() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}