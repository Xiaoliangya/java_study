package com.test.test05;

public class Peasant extends Employee {
    public Peasant(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void display() {
        System.out.print("农民:");
        super.display();
    }
}
