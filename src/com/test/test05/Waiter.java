package com.test.test05;

public class Waiter extends Employee {
    public Waiter(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void display() {
        System.out.print("服务员:");
        super.display();
    }
}
