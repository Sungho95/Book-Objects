package com.book.objects.oop.srp;

public class EmployeeFacade {
    String name;

    public EmployeeFacade(String name) {
        this.name = name;
    }

    int calculatePay() { // 재무팀에서 사용하는 기능
        int result = 0;

        PayCalculator payCalculator = new PayCalculator();
        payCalculator.calculatePay();

        return result;
    }

    int reportHours() { // 인사팀에서 사용하는 기능
        int result = 0;

        HourReporter hourReporter = new HourReporter();
        hourReporter.reportHours();

        return result;
    }

    void save() { // 기술팀에서 사용하는 기능
        EmployeeSaver employeeSaver = new EmployeeSaver();
        employeeSaver.saveDatabase();
    }
}

class PayCalculator {
    void calculatePay() {
        // ...
        this.regularHours();
        // ...
    }

    void regularHours() {
        // ...
    }
}

class HourReporter {
    void reportHours() {
        // ...
        this.regularHours();
        // ...
    }

    void regularHours() {
        // ...
    }
}

class EmployeeSaver {
    void saveDatabase() {
        // ...
    }
}