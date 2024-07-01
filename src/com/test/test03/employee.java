package com.test.test03;

public class employee {
    private String name;
    private double salary_daily;
    private int work_days;
    private double level;

    public employee(String name, double salary_daily, int work_days, double level) {
        this.name = name;
        this.salary_daily = salary_daily;
        this.work_days = work_days;
        this.level = level;
    }

    public void printsalary() {
        double salary = salary_daily * work_days * level;
        System.out.println("Salary of " + name + " is " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary_daily() {
        return salary_daily;
    }

    public void setSalary_daily(double salary_daily) {
        this.salary_daily = salary_daily;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
