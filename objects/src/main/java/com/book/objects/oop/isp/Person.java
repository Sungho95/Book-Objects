package com.book.objects.oop.isp;

import java.time.LocalDate;

class Person {
    String name;

    void eat() {
        System.out.println("음식을 먹습니다.");
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    LocalDate birthDay;
    String residentRegistrationNumber;
    String studentNumber;

    public Student(String name, LocalDate birthDay, String residentRegistrationNumber, String studentNumber) {
        super(name);
        this.birthDay = birthDay;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.studentNumber = studentNumber;
    }

    void sleep() {
        System.out.println("잠을 잡니다.");
    }

    void introduce() {
        System.out.println("자기소개를 합니다.");
    }

    void study() {
        System.out.println("공부를 합니다.");
    }
}

class Army extends Person {
    LocalDate birthDay;
    String residentRegistrationNumber;
    String armyNumber;

    public Army(String name, LocalDate birthDay, String residentRegistrationNumber, String armyNumber) {
        super(name);
        this.birthDay = birthDay;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.armyNumber = armyNumber;
    }

    void sleep() {
        System.out.println("잠을 잡니다.");
    }

    void introduce() {
        System.out.println("자기소개를 합니다.");
    }

    void train() {
        System.out.println("훈련을 합니다.");
    }
}

class Driver {
    public static void main(String[] args) {
        Person kim = new Student("김학생", LocalDate.of(2000, 1, 1), "20000101-1234567", "20190001");
        Person lee = new Army("이군인", LocalDate.of(1998, 12, 31), "19981231-1234567", "19-12345678");

        System.out.println(kim.name);
        System.out.println(lee.name);

        System.out.println(((Student) kim).birthDay); // 캐스팅 필요
        System.out.println(((Army) lee).birthDay); // 캐스팅 필요

        kim.eat();
        lee.eat();

        ((Student) kim).sleep(); // 캐스팅 필요
        ((Army) lee).sleep(); // 캐스팅 필요

        ((Student) kim).introduce(); // 캐스팅 필요
        ((Army) lee).introduce(); // 캐스팅 필요

        ((Student) kim).study(); // 캐스팅 필요
        ((Army) lee).train(); // 캐스팅 필요
    }
}