package com.book.objects.oop.dip;

class A {
    public void runA() {
        System.out.println("runA");
    }
}

class B {
    private A a;

    public B() {
        this.a = new A(); // 의존 관계 성립
    }

    public void runB() {
        a.runA();
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.runB();
    }
}