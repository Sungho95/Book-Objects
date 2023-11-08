package com.book.objects.oop.srp;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    int calculatePay() { // 재무팀에서 사용하는 기능
        int result = 0;
        // ...
        this.regularHours();
        // ...
        return result;
    }

    int reportHours() { // 인사팀에서 사용하는 기능
        int result = 0;
        // ...
        this.regularHours();
        // ...
        return result;
    }

    void save() { // 기술팀에서 사용하는 기능
        // ...
    }

    void regularHours() {
        // ...
    }
}
