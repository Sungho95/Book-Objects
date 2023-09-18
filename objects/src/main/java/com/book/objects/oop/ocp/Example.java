package com.book.objects.oop.ocp;

/**
 * OCP를 지키지 않는 경우
 */
//class Car {
//    String type;
//
//    public Car(String type) {
//        this.type = type;
//    }
//}
//
//class Person {
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    void openWindow(Car car) {
//        if (car.type.equals("마티즈")) {
//            System.out.println("수동으로 창문을 개방합니다.");
//        } else if (car.type.equals("쏘나타")) {
//            System.out.println("자동으로 창문을 개방합니다.");
//        }
//    }
//
//    void operateGear(Car car) {
//        if (car.type.equals("마티즈")) {
//            System.out.println("수동으로 기어를 조작합니다.");
//        } else if (car.type.equals("쏘나타")) {
//            System.out.println("자동으로 기어를 조작합니다.");
//        }
//    }
//}

/**
 * OCP를 지키는 경우
 */
interface Car {
    void openWindow();
    void operateGear();
}

class Matiz implements Car {
    @Override
    public void openWindow() {
        System.out.println("수동으로 창문을 개방합니다.");
    }

    @Override
    public void operateGear() {
        System.out.println("수동으로 기어를 조작합니다.");
    }
}

class Sonata implements Car {
    @Override
    public void openWindow() {
        System.out.println("자동으로 창문을 개방합니다.");
    }

    @Override
    public void operateGear() {
        System.out.println("자동으로 기어를 조작합니다.");
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void openWindow(Car car) {
        car.openWindow();
    }

    void operateGear(Car car) {
        car.operateGear();
    }
}