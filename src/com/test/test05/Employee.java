package com.test.test05;

public class Employee {
    private double sal;
    private String name;

    public Employee(double sal, String name) {
        this.sal = sal;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + sal);
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
