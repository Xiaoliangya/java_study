package com.test.test05;

public class Worker extends Employee {
    public Worker(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void display() {
        System.out.print("工人:");
        super.display();
    }
}
