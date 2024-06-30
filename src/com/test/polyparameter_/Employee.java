package com.test.polyparameter_;

public class Employee {
    private String name;
    private double mouthlysalary;

    public Employee(String name, double mouthlysalary) {
        this.name = name;
        this.mouthlysalary = mouthlysalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return mouthlysalary;
    }

    public void setSalary(double salary) {
        this.mouthlysalary = salary;
    }

    public double getAnnual() {
        return mouthlysalary*12;
    }

}
