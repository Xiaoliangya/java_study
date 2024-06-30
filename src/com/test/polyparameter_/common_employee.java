package com.test.polyparameter_;

public class common_employee extends Employee {
    public common_employee(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("I am a common employee and I work.");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
