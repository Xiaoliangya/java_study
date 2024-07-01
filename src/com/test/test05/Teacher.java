package com.test.test05;

public class Teacher extends Employee {

    private double classSal;
    private int classDay;

    public Teacher(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void display() {
        System.out.print("教师:");
        System.out.println("Name: " + getName() + ", Salary: " + (getSal() + getClassSal() * getClassDay()));
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }
}
