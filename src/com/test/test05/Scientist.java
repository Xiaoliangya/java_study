package com.test.test05;

public class Scientist extends Employee {

    private double bonus;

    public Scientist(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void display() {
        System.out.print("科学家:");
        System.out.println("Scientist: " + getName() + " " + "Salary: " + (getSal() + getBonus()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
