package com.book.objects.designpattern.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        Coffee americanoShotAdd = new ShotDecorator(americano);
        Coffee americanoShotSugarAdd = new SugarDecorator(americanoShotAdd);

        // 아메리카노 샷 추가
        System.out.println(americanoShotAdd.getCoffee());
        System.out.println(americanoShotAdd.getPrice());

        // 아메리카노 샷, 설탕 추가
        System.out.println(americanoShotSugarAdd.getCoffee());
        System.out.println(americanoShotSugarAdd.getPrice());
    }
}
